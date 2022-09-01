package com.arquitectura.emergency.room.core.usecase.emergency.call.imp;


import com.arquitectura.emergency.room.core.dto.emergency.Emergency;
import com.arquitectura.emergency.room.core.usecase.emergency.call.CallRoom;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CallRoomInsuranceImpl implements CallRoom {
    @Override
    public boolean call(Emergency emergency) {

        log.info("Call Room Insurance");
        return false;
    }

    @Override
    public String name() {
        return null;
    }
}
