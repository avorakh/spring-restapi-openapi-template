package dev.avorakh.isdp.template.controller;

import dev.avorakh.isdp.template.resource.AppInfoMeta;
import dev.avorakh.isdp.template.svc.AppInfoService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.jspecify.annotations.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AppInfoController {

    @NonNull AppInfoService appInfoService;

    @GetMapping("/app/info")
    public @NonNull AppInfoMeta getAppInfo() {

        return appInfoService.getAppInfo();
    }
}
