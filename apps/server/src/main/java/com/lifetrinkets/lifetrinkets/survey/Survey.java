package com.lifetrinkets.lifetrinkets.survey;

import com.lifetrinkets.lifetrinkets.user.User;
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
public class Survey {
    @Id
    private Long id;

    @OneToOne
    private User user;

    //todo: physique

    private Long age;
    private Double initialExperienceBasedOnLife;
}
