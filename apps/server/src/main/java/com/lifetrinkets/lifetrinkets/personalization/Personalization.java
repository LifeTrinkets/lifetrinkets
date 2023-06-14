package com.lifetrinkets.lifetrinkets.personalization;

import com.lifetrinkets.lifetrinkets.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
    private Long id;

    private String theme;
    private String color;
    private String profileImg;
    private String skin;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;
}
