package dev.avorakh.isdp.template.resource;

import lombok.Builder;
import org.jspecify.annotations.NonNull;

@Builder
public record AppInfoMeta(boolean success, @NonNull String name) {}
