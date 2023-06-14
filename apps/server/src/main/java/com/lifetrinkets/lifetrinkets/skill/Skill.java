package com.lifetrinkets.lifetrinkets.skill;

import com.lifetrinkets.lifetrinkets.progress.Progress;
import com.lifetrinkets.lifetrinkets.task.TaskSkill;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Skill {
    @Id
    private Long id;

    private String name;
    private float modifier;
    private String rank;

    @OneToMany
    private List<TaskSkill> taskSkills;
    @OneToMany
    private List<Progress> progressList;
}
