package com.arquitectura.emergency.room.router.impl.room;


import com.arquitectura.emergency.room.core.dto.emergency.Emergency;
import com.arquitectura.emergency.room.core.usecase.emergency.call.CallRoomProcess;
import com.arquitectura.emergency.room.router.BaseRouter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
public class EmergencyRoom extends BaseRouter {
    private CallRoomProcess callRoomProcess;

    @Autowired
    public EmergencyRoom(CallRoomProcess callRoomProcess) {
        this.callRoomProcess = callRoomProcess;
    }

    @PostMapping(value = {"/call-emergency"})
    public ResponseEntity<String> callEmergencyRoom(@Valid @RequestBody Emergency request) {
        callRoomProcess.validateCallFeed(request);
        return ResponseEntity.ok("OK");
    }
}
