package com.lifetrinkets.lifetrinkets.personalization;

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
public class Personalization {

    @Id
    private String id;

    private String theme;
    private String color;
    private String profileImg;
    private String skin;

    @OneToOne
    @MapsId
    private User user;
}
