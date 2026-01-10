package dev.avorakh.isdp.template.svc;

import dev.avorakh.isdp.template.model.AppInfoMeta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppInfoServiceImplTest {

    private AppInfoService sut;

    @BeforeEach
    void init() {

        sut = new AppInfoServiceImpl();
    }

    @Test
    void shouldSuccessfullyGetAppInfo() {

        var expected = AppInfoMeta.builder().success(true).name("template").build();

        var actual = sut.getAppInfo();

        Assertions.assertEquals(expected, actual, "Should be equaled the expected value");
    }
}
