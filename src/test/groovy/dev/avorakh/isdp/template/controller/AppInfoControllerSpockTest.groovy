package dev.avorakh.isdp.template.controller

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

import dev.avorakh.isdp.template.svc.AppInfoServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.context.annotation.Import
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

@Import(AppInfoServiceImpl)
@WebMvcTest(AppInfoController.class)
class AppInfoControllerSpockTest extends Specification {

    @Autowired
    MockMvc mockMvc


    def 'shouldSuccess fully Return Ok SC And Success With True In Body'() {

        given:
        def request = get('/app/info').accept(MediaType.APPLICATION_JSON)

        when:
        def result = mockMvc.perform(request)

        then:
        result.andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath('$.success').isBoolean())
                .andExpect(jsonPath('$.success').value(true))
                .andExpect(jsonPath('$.name').isString())
                .andExpect(jsonPath('$.name').value('template'))
    }
}
