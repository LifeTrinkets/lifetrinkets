package com.lifetrinkets.lifetrinkets.skill;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
    private String id;

    private String name;
    private double modifier;
    private String rank;

    @OneToOne
    private Progress progress;
}
