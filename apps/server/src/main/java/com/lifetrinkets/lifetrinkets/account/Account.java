package com.lifetrinkets.lifetrinkets.account;

import com.lifetrinkets.lifetrinkets.token.RefreshToken;
import com.lifetrinkets.lifetrinkets.user.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
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
public class Account {

    @Id
    private String id;

    private String email;
    private String provider;
    private String accessToken;

    private OffsetDateTime accountVerified;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private Set<RefreshToken> refreshToken = new HashSet<>();

    @OneToOne
    @MapsId
    private User user;
}
