package com.margorp.any.date.web


import com.margorp.any.date.service.DateService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate


@RestController
@RequestMapping("/date")
class DateController {
    @Autowired
    lateinit var dateService: DateService
    @GetMapping("/lunardate")
    suspend fun solarDateToLunarDate(): LocalDate {
        print(11111)

        val lunarDate = dateService.solarDateToLunarDateByPublicDataApi(LocalDate.of(2022,12,31))

        return lunarDate
    }
}