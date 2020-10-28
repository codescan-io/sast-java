package io.codescan.sast.model;

import lombok.Data;

@Data
public class Identifier {

    /**
     * For example, cve, cwe, osvdb, usn, or an analyzer-dependent type such as gemnasium).
     */
    private String type;

    /**
     * Human-readable name of the identifier.
     */
    private String name;

    /**
     * URL of the identifier's documentation.
     */
    private String url;

    /**
     * Value of the identifier, for matching purpose.
     */
    private String value;
}
