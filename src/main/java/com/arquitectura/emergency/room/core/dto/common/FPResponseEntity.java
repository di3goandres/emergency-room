package com.arquitectura.emergency.room.core.dto.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FPResponseEntity {

    public static final int SUCCESS_CODE = 0;
    public static final int ERROR_CODE = -1;
    public static final int WARNING_CODE = 1;
    private int resultCode;
    private Object result;
    private String resultMessage;
    @JsonIgnore
    private List<String> listIds;
    @JsonIgnore
    private String url;

}
