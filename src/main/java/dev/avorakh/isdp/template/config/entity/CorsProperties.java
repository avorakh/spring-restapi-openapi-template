package dev.avorakh.isdp.template.config.entity;

import static dev.avorakh.isdp.template.constnants.CorsConstants.DEFAULT_MAX_AGE_SECONDS;
import static dev.avorakh.isdp.template.constnants.CorsConstants.DISABLED;

import java.util.List;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "app.cors")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CorsProperties {

    boolean enabled = DISABLED;

    List<String> allowedOrigins = List.of();

    List<String> allowedMethods = List.of();

    List<String> allowedHeaders = List.of();

    boolean allowCredentials = DISABLED;

    long maxAge = DEFAULT_MAX_AGE_SECONDS;
}
