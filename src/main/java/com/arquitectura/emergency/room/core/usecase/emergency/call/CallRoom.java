package com.arquitectura.emergency.room.core.usecase.emergency.call;

import com.arquitectura.emergency.room.core.dto.emergency.Emergency;

public interface CallRoom {

    boolean call(Emergency emergency);

    String name();
}
