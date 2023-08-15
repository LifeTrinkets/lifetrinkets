package com.lifetrinkets.lifetrinkets.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lifetrinkets.lifetrinkets.item.Item;
import com.lifetrinkets.lifetrinkets.personalization.Personalization;
import com.lifetrinkets.lifetrinkets.task.Task;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    private String title;
    private String description;
    private Date createdAt;
    //private Account createdBy; ??
    private Date modifiedAt;
    private Date birthday;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private Personalization personalization;

    @OneToMany
    private List<Task> tasks;

    @ManyToMany
    @JoinColumn(name = "item_id")
    private Set<Item> items = new HashSet<>();
}
