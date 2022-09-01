package com.arquitectura.emergency.room.util;

import java.util.List;
import java.util.Optional;

/**
 * Utility class for scope information.
 */
public interface ScopeUtils {
    String SCOPE = "SCOPE";
    String SCOPE_VALUE = System.getenv(SCOPE);
    String SPRING_PROFILE = "SCOPE_SUFFIX";

    List<String> productionScopes = List.of(Profiles.PROD.getName());

    static void calculateScope() {
        System.setProperty(SPRING_PROFILE, getSpringProfile(SCOPE_VALUE));
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
}
