package dev.avorakh.isdp.template.svc;

import dev.avorakh.isdp.template.resource.AppInfoMeta;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;

@Service
public class AppInfoServiceImpl implements AppInfoService {

    @Override
    public @NonNull AppInfoMeta getAppInfo() {

        return new AppInfoMeta(true, "template");
    }
}
