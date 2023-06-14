package com.lifetrinkets.lifetrinkets.personalization;

import com.lifetrinkets.lifetrinkets.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonalizationRepository extends JpaRepository<Personalization, Long> {
    Optional<Personalization> findByUser(User user);
}
