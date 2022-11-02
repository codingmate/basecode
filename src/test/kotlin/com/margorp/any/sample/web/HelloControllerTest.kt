package com.margorp.any.sample.web

import org.junit.jupiter.api.Test


import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.TestConstructor

import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders

import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.util.LinkedMultiValueMap


import kotlin.jvm.Throws


@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@WebMvcTest(controllers = [HelloController::class]) // Web Test. useable @controller, @ControllerAdvice but can't using @Service, @Component, @Repository
class HelloControllerTest ( /*@Autowired*/ var mvc : MockMvc ) {
    @Test
    @Throws(Exception::class)
    fun return_String_Hello() {
        val expectedString = "Hello"
        val queryParams = LinkedMultiValueMap<String, String>()
        queryParams.add("name", "condingmate")

        mvc.perform(MockMvcRequestBuilders.get("/hello").queryParams(queryParams))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string(expectedString))
            //.andDo(MockMvcResultHandlers.print())
    }

}