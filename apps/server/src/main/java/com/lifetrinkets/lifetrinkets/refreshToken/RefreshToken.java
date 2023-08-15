package com.lifetrinkets.lifetrinkets.refreshToken;

import com.lifetrinkets.lifetrinkets.account.Account;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RefreshToken {

    @Id
    private String id;

    private OffsetDateTime expires;

    private String token;

    @ManyToOne
    private Account account;
}
