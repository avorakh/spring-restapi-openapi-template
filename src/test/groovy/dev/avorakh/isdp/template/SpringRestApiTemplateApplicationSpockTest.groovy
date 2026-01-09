package dev.avorakh.isdp.template

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.core.env.Environment
import spock.lang.Specification

@SpringBootTest
class SpringRestApiTemplateApplicationSpockTest extends Specification {

    @Autowired
    Environment env

    def 'should successfully load context'() {
        expect:
        env
    }
}
