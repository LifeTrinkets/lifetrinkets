package com.lifetrinkets.lifetrinkets.survey;

import com.lifetrinkets.lifetrinkets.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
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
    private String id;

    private Long age;

    private Double relExp;

    @OneToOne
    @MapsId
    private User user;
}
