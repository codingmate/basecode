package com.margorp.any.date.service

import reactor.core.publisher.Mono
import java.time.LocalDate


interface DateService {

    suspend fun solarDateToLunarDateByPublicDataApi(solarDate: LocalDate): LocalDate
    suspend fun LunarDateToSolarDateByPublicDataApi(LunarDate: LocalDate): LocalDate

}