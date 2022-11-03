package com.margorp.any.sample.web.dto




import org.junit.jupiter.api.Test



internal class HelloResponseDtoTest {

    @Test
    fun dtoTest () /*: Unit*/{
        val name = "Hello"
        val age = 27

        val dto = HelloResponseDto(name, age)

        assert(dto.name == "Hello1") // false = fail



    }
}