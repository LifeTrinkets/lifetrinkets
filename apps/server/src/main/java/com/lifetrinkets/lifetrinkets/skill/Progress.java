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
public class Progress {
    @Id
    private String id;

    private double current_exp;
    private double exp_to_next_level;
    private int level;

    @OneToOne
    private Skill skill;
}
