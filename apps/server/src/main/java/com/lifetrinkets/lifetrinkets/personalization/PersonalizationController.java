package com.lifetrinkets.lifetrinkets.personalization;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/personalization")
public class PersonalizationController {

    private final PersonalizationService personalizationService;

    @GetMapping("/get/{userId}")
    public ResponseEntity<Personalization> getPersonalizationById(@PathVariable Long userId) {
        return new ResponseEntity<>(personalizationService.getPersonalizationDataById(userId), HttpStatus.OK);
    }
}
