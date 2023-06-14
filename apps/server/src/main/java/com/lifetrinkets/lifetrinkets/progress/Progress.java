package com.lifetrinkets.lifetrinkets.progress;

import com.lifetrinkets.lifetrinkets.skill.Skill;
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
    private Long id;

    @OneToOne
    private Skill skill;

    private Long level;
    private Double currentExp;
    private Double expToNextLevel;

}
