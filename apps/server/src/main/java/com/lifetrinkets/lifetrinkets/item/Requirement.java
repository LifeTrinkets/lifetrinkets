package com.lifetrinkets.lifetrinkets.item;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Requirement {
    @Id
    private Long id;
    private String value;

    @Enumerated
    private RequirementType requirementType;

    @ManyToOne
    @JoinColumn(name = "item")
    private Item item ;
}
//s