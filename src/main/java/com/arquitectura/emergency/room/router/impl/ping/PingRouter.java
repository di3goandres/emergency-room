package com.arquitectura.emergency.room.router.impl.ping;

import com.arquitectura.emergency.room.router.BaseRouter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PingRouter extends BaseRouter {

    /**
     * Ping endpoint to verify if API is running properly.
     *
     * @return "pong"
     */

    @GetMapping(value = {"/ping"})
    public ResponseEntity<String> pingVersion() {
        return ResponseEntity.ok(System.getenv("SCOPE"));
    }
}
