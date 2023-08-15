package com.lifetrinkets.lifetrinkets.item;

import com.lifetrinkets.lifetrinkets.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    private Long id;

    private String description;
    private Double value;

    @Enumerated
    private ItemType itemType;

    @ManyToOne
    private Origin origin;

    @OneToMany
    private Set<Requirement> requirements = new HashSet<>();

    @ManyToMany(mappedBy = "item")
    private Set<User> users = new HashSet<>();

}
