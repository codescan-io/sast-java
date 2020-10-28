package io.codescan.sast.model;

import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.StringUtils;

/**
 * Describes how much the vulnerability impacts the software.
 */
public enum Severity {

    UNKNOWN, INFO, LOW, MEDIUM, HIGH, CRITICAL;

    @JsonValue
    public String getKey() {
        return StringUtils.capitalize(name().toLowerCase());
    }
}
