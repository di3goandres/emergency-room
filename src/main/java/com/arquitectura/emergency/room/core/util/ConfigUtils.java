package com.arquitectura.emergency.room.core.util;

/**
 * Provides an interface to the config, regardless of the framework behind the scenes
 */
public interface ConfigUtils {
    <T> T getProperty(String key, T defaultValue);
}
