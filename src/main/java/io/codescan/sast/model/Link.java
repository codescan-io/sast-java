package io.codescan.sast.model;

import lombok.Data;

/**
 * An array of references to external documentation or articles that describe the vulnerability.
 */
@Data
public class Link {

    /**
     * Name of the vulnerability details link.
     */
    private String name;

    /**
     * URL of the vulnerability details document.
     */
    private String url;
}
