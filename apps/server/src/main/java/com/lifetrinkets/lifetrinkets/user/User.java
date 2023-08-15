package com.lifetrinkets.lifetrinkets.user;

import com.lifetrinkets.lifetrinkets.account.Account;
import com.lifetrinkets.lifetrinkets.personalization.Personalization;
import com.lifetrinkets.lifetrinkets.survey.Survey;
import com.lifetrinkets.lifetrinkets.task.Task;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
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
public class User {

    @Id
    private String id;

    private String name;
    private String title;
    private String description;

    private OffsetDateTime createdAt;
    private OffsetDateTime modifiedAt;
    private OffsetDateTime birthday;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Personalization personalization;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Survey survey;

//    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    private Set<Item> items = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn
    private Set<Task> tasks = new HashSet<>();
}
