package com.arquitectura.emergency.room.util;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Optional;

/**
 * Utility class for scope information.
 */
public interface ScopeUtils {
    String PORT = "PORT";
    String SCOPE = "SCOPE";
    String SCOPE_VALUE = System.getenv(SCOPE);

    String PORT_VALUE = System.getenv(PORT);
    String SPRING_PROFILE = "SCOPE_SUFFIX";

    List<String> productionScopes = List.of(Profiles.PROD.getName());

    static void calculateScope() {
        System.setProperty(SPRING_PROFILE, getSpringProfile(SCOPE_VALUE));
        System.setProperty(PORT, getPort(PORT_VALUE));
    }

    static String getSpringProfile(String scope) {
        if (Optional.ofNullable(scope).isEmpty() || scope.contains(Profiles.LOCAL.getName())) {
            return Profiles.LOCAL.getName();
        } else if (scope.contains(Profiles.TEST.getName())) {
            return Profiles.TEST.getName();
        } else if (scope.contains(Profiles.STAGE.getName())) {
            return Profiles.STAGE.getName();
        } else if (scope.contains(Profiles.PROD.getName())) {
            return Profiles.PROD.getName();
        }
        return Profiles.LOCAL.getName();
    }


    static String getPort(String port) {
        if (Optional.ofNullable(port).isEmpty() || !StringUtils.isNumeric(port)) {
            return Ports.LOCAL.getPort();
        } else{
            return port;
        }
    }

    static boolean isLocalScope() {
        return Profiles.LOCAL.getName().equals(getSpringProfile(SCOPE_VALUE));
    }

    static boolean isProduction() {
        return productionScopes.contains(ScopeUtils.getSpringProfile(SCOPE_VALUE));
    }

    enum Profiles {
        LOCAL("local"),

        TEST("test"),
        STAGE("stage"),
        PROD("prod");


        private String name;

        Profiles(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        }
    enum Ports {
        LOCAL("8080");

        private String name;

        Ports(String name) {
            this.name = name;
        }
        public String getPort() {
            return name;
        }
    }

}
