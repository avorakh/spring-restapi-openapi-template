package dev.avorakh.isdp.template.svc;

import dev.avorakh.isdp.template.model.AppInfoMeta;
import org.jspecify.annotations.NonNull;

@FunctionalInterface
public interface AppInfoService {

    @NonNull AppInfoMeta getAppInfo();
}
