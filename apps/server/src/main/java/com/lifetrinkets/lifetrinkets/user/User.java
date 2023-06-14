package com.lifetrinkets.lifetrinkets.user;

import com.lifetrinkets.lifetrinkets.personalization.Personalization;
import com.lifetrinkets.lifetrinkets.task.Task;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

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
    private String desc;
    private Date createdAt;
    //private Account createdBy; ??
    private Date modifiedAt;
    private Date birthday;

    @OneToOne
    private Personalization personalization;

    @OneToMany
    private List<Task> tasks;
}
