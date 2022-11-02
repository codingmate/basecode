package com.margorp.any.sample.web

import org.junit.jupiter.api.Test
import org.mockito.Mock

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.util.LinkedMultiValueMap


import kotlin.jvm.Throws


@WebMvcTest // Web Test. useable @controller, @ControllerAdvice but can't using @Service, @Component, @Repository
class HelloControllerTest {

    @Mock // @Autowired useable
    private lateinit var mvc : MockMvc

    @Test
    @Throws(Exception::class)
    fun hello()  {
        val hello = "hello"
        val queryParams = LinkedMultiValueMap<String, String>()
        queryParams.add("name", "condingmate")


        mvc.perform( MockMvcRequestBuilders.get("/hello").queryParams(queryParams) )
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("codingmate"))
            .andDo(MockMvcResultHandlers.print())
    }


}