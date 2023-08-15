package com.lifetrinkets.lifetrinkets.grade;

import com.lifetrinkets.lifetrinkets.skill.Skill;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Grade {

    @Id
    private String id;

    private String rankCall;

    @OneToMany(mappedBy = "grade", cascade = CascadeType.ALL)
    private Set<Skill> skills;
}
