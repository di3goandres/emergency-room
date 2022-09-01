package com.arquitectura.emergency.room.core.usecase.emergency.call;

import com.arquitectura.emergency.room.core.dto.emergency.Emergency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

@Slf4j
@Service
public class CallRoomProcess {
    List<CallRoom> callRooms;
    private Executor asyncExecutor;

    @Inject
    public CallRoomProcess( List<CallRoom> callRooms, Executor asyncExecutor) {
        this.callRooms = callRooms;
        this.asyncExecutor = asyncExecutor;
    }

    public void validateCallFeed(Emergency emergency){

        Set<Boolean> results = new HashSet<>();

        log.info("init");
        CompletableFuture.allOf(callRooms
                .stream()
                .map(validator -> CompletableFuture.runAsync(() -> results.add(validator.call(emergency)), asyncExecutor))
                .toArray(CompletableFuture[]::new)
        ).join();
        log.info("finish");

    }
}
