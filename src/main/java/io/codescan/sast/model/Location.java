package io.codescan.sast.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Identifies the vulnerability's location.
 */
@Data
public class Location {

    /**
     * Path to the file where the vulnerability is located.
     */
    private String file;

    /**
     * The first line of the code affected by the vulnerability.
     */
    private Integer startLine;

    /**
     * The last line of the code affected by the vulnerability.
     */
    private Integer endLine;

    /**
     * Provides the name of the class where the vulnerability is located.
     */
    @JsonProperty("class")
    private String className;

    /**
     * Provides the name of the method where the vulnerability is located.
     */
    private String method;
}
