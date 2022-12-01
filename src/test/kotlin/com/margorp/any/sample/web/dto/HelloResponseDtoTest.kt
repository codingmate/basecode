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

    @Test
    fun data_class_test() {
        //given
        val name = "Hello"
        val age = 27

        //when
        val dto = HelloResponseDto(name, age)

        //then
        assert(dto.name == "Hello") // false = fail
        //assert(dto.name == "Hello1") // false = fail
    }
}