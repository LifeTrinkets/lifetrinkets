package com.lifetrinkets.lifetrinkets.task;

import com.lifetrinkets.lifetrinkets.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    private String id;

    private String title;
    private String description;

    private int difficulty;

    private OffsetDateTime createdAt;
    private OffsetDateTime modifiedAt;

    @ManyToMany(mappedBy = "tasks")
    private Set<User> users = new HashSet<>();
}
