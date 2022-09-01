package com.arquitectura.emergency.room.config;

import com.arquitectura.emergency.room.util.ScopeUtils;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.lang.String.format;

/**
 * Class configuration for Spring Docs.
 */
@Configuration
public class SpringDocConfig {
    private static final String LOCAL_URL = "http://localhost:8080";

    /**
     * Creates a bean with OpenApi configurations.
     *
     * @param appName     the application name.
     * @param description the application description.
     * @param version     the application version.
     * @return an object of type {@link OpenAPI}
     */
    @Bean
    public OpenAPI customOpenAPI(@Value("${app.title}") String appName,
                                 @Value("${app.description}") String description,
                                 @Value("${app.version}") String version) {
        OpenAPI api = new OpenAPI().info(new Info().title(appName)
                .version(version)
                .description(description)
                .contact(new Contact().name("emergency-room")
                        .email("d3egoandres@gmail.com")));
        api.addServersItem(new Server().url(LOCAL_URL)
                .description(format("Scope %s", ScopeUtils.SCOPE_VALUE)));
        return api;
    }
}
