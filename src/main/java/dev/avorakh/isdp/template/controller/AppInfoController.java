package dev.avorakh.isdp.template.controller;

import dev.avorakh.isdp.template.api.AppInfoApi;
import dev.avorakh.isdp.template.model.AppInfoMeta;
import dev.avorakh.isdp.template.svc.AppInfoService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.jspecify.annotations.NonNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AppInfoController implements AppInfoApi {

    @NonNull AppInfoService appInfoService;

    @Override
    public ResponseEntity<AppInfoMeta> getAppInfo() {

        return ResponseEntity.ok(appInfoService.getAppInfo());
    }
}
