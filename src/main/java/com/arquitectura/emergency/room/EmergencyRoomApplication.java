package com.arquitectura.emergency.room;

import com.arquitectura.emergency.room.config.SpringConfig;
import com.arquitectura.emergency.room.util.ScopeUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EmergencyRoomApplication {

    public static void main(String[] args) {
        ScopeUtils.calculateScope();
        new SpringApplicationBuilder(SpringConfig.class).registerShutdownHook(true).run(args);
    }

}
