package com.lifetrinkets.lifetrinkets.skill;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Skill {
    @Id
    private Long id;

    private String name;
    private float modifier;
    private String rank;
}
