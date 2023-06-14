package com.lifetrinkets.lifetrinkets.task;

import com.lifetrinkets.lifetrinkets.skill.Skill;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskSkill {

    @Id
    private Long id;

    @OneToOne
    private Task task;

    @OneToMany
    private List<Skill> skillList;

}
