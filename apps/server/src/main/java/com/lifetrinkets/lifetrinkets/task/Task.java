package com.lifetrinkets.lifetrinkets.task;

import com.lifetrinkets.lifetrinkets.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    private Long id;

    private String title;
    private String description;
    private int difficulty;
    private Date createdAt;
    private Date modifiedAt;

    @ManyToOne
    private User createdBy;

    @OneToOne
    private TaskSkill taskSkill;
}
