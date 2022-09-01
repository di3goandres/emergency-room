package com.arquitectura.emergency.room.router;

import com.arquitectura.emergency.room.core.dto.common.ErrorResponse;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arc-software/emergency-room")
public abstract class BaseRouter {
    protected ErrorResponse errorMsg(String errorMsg, Logger log) {
        ErrorResponse errorResponse = ErrorResponse.builder()
                .resultMessage(errorMsg)
                .build();
        log.error(errorResponse.getResultMessage());

        return errorResponse;
    }
}
