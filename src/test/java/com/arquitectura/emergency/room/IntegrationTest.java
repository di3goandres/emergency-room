package com.arquitectura.emergency.room;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = EmergencyRoomApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = { "SCOPE_SUFFIX = local" })
@TestPropertySource(properties = { "PORT = 8080" })

public abstract class IntegrationTest {

	@AfterEach
	protected void afterEach() {
	}
}
