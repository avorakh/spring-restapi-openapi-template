package dev.avorakh.isdp.template.config;

import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.cors")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CorsProperties {

    boolean enabled = false;

    List<String> allowedOrigins = List.of();

    List<String> allowedMethods = List.of();

    List<String> allowedHeaders = List.of();

    boolean allowCredentials = false;

    long maxAge = 3600;
}

