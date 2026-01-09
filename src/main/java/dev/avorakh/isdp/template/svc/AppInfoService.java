package dev.avorakh.isdp.template.svc;

import dev.avorakh.isdp.template.resource.AppInfoMeta;
import org.jspecify.annotations.NonNull;

@FunctionalInterface
public interface AppInfoService {

    @NonNull AppInfoMeta getAppInfo();
}
