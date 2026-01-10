package dev.avorakh.isdp.template.svc;

import dev.avorakh.isdp.template.model.AppInfoMeta;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;

@Service
public class AppInfoServiceImpl implements AppInfoService {

    @Override
    public @NonNull AppInfoMeta getAppInfo() {

        return AppInfoMeta.builder().success(true).name("template").build();
    }
}
