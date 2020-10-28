package io.codescan.sast.model;

import lombok.Data;

/**
 * Describes the scanner used to find this vulnerability.
 */
@Data
public class Scanner {

    /**
     * The scanner's ID, as a snake_case string.
     */
    private String id;

    /**
     * Human-readable name of the scanner.
     */
    private String name;
}
