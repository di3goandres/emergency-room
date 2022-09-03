package com.arquitectura.emergency.room.core.dto.emergency;


import com.arquitectura.emergency.room.core.dto.location.Location;
import com.arquitectura.emergency.room.core.dto.features.Features;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Emergency {
    @NotEmpty
    private String truckId;
    private String signalType;
    private String timestamp;
    private String  shipmentStatus;
    private Location location;

    private List<Features> features;
}
