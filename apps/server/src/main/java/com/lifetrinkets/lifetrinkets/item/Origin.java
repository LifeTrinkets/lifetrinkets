package com.lifetrinkets.lifetrinkets.item;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Origin {
    @Id
    private Long id;

    private String name;
    private String description;

    @OneToMany
    private Set<Item> item = new HashSet<>();
}
//s