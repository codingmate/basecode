package com.margorp.any.date.web

import com.margorp.any.date.param.SolarDateParam
import com.margorp.any.date.service.DateService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.time.LocalDate


@Controller
@RequestMapping("/date")
class DateController(
        val dateService: DateService
) {
    @GetMapping("/lunardate")
    @ResponseBody
    suspend fun solarDateToLunarDate(p: SolarDateParam): LocalDate {
        return dateService.solarDateToLunarDate(LocalDate.of(2022,12,31))
    }
}