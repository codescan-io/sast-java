package io.codescan.sast.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

/**
 * Report for Static Application Security Testing analyzers (https://docs.gitlab.com/ee/user/application_security/sast).
 */
@Data
public class Report {

    /**
     * The URI of the JSON schema corresponding to the version.
     */
    @JsonProperty("$schema")
    private String schema = "https://gitlab.com/gitlab-org/security-products/security-report-schemas/-/raw/339942e4456479a169f7a01c266a8c7bf49b869c/dist/sast-report-format.json";

    /**
     * Report syntax version used to generate SAST JSON.
     */
    private String version = "8.0.1";

    /**
     * Array of vulnerability objects.
     */
    private List<Vulnerability> vulnerabilities;
}
