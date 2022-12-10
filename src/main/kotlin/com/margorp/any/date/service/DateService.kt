package com.margorp.any.date.service

import java.time.LocalDate


interface DateService {

    suspend fun solarDateToLunarDate(solarDate: LocalDate): LocalDate
    suspend fun LunarDateTosolarDate(LunarDate: LocalDate): LocalDate

}