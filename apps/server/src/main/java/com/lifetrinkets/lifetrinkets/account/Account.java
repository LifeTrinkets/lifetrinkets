package com.lifetrinkets.lifetrinkets.account;

import com.lifetrinkets.lifetrinkets.token.RefreshToken;
import com.lifetrinkets.lifetrinkets.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    private Long id;

    private String email;
    private String password; // pogadac z Matim
    private String provider;

    private String accessToken;
    private Date accountVerified;

    @OneToMany
    private List<RefreshToken> refreshToken;

    @OneToOne
    private User user;
}
