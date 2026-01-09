package dev.avorakh.isdp.template.svc

import spock.lang.Specification

class AppInfoServiceImplSpockTest extends Specification {

    AppInfoService sut

    def setup() {
        sut = new AppInfoServiceImpl()
    }

    def 'should successfully get app info'() {
        when:
        def actual = sut.getAppInfo()

        then:
        actual
        with(actual) {
            success()
            name() == 'template'
        }
    }
}
