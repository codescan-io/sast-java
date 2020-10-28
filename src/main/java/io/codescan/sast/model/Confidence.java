package io.codescan.sast.model;

import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.StringUtils;

/**
 * Describes how reliable the assessment of the vulnerability is.
 */
public enum Confidence {

    IGNORE, UNKNOWN, EXPERIMENTAL, LOW, MEDIUM, HIGH, CONFIRMED;

    @JsonValue
    public String getKey() {
        return StringUtils.capitalize(name().toLowerCase());
    }
}
