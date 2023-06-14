package com.lifetrinkets.lifetrinkets.personalization;

import com.lifetrinkets.lifetrinkets.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonalizationService {

    private final PersonalizationRepository personalizationRepository;
    private final UserRepository userRepository;


    public Personalization getPersonalizationDataById(Long userId) {
        return personalizationRepository.findByUser(
                userRepository.findById(userId)
                        .orElseThrow(() -> new RuntimeException("User not found"))
        ).orElseThrow(() -> new RuntimeException("Personalization not found"));
    }
}
