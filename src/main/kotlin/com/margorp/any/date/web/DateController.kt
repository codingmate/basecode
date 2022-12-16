package com.margorp.any.date.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.time.LocalDate


@Controller
@RequestMapping("/date")
class DateController(

) {
    @GetMapping("/lunardate")
    @ResponseBody
    suspend fun solarDateToLunarDate(): LocalDate {
        return LocalDate.of(2022, 12, 31)
    }
}