package com.arquitectura.emergency.room.core.dto.emergency;


import com.arquitectura.emergency.room.core.dto.signal.Signal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Emergency {
    @NotEmpty
    private Signal signal;
}
