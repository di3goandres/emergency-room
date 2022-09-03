package com.arquitectura.emergency.room.core.dto.features;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Features {
    private String featureName;
    private FeatureValue featureValue;
}
