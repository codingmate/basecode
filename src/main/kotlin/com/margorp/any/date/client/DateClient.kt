package com.margorp.any.date.client

import java.time.LocalDate

interface DateClient {
    suspend fun getLunaDateBySolarDate(solarDate: LocalDate): String
    //suspend fun getLunaDate(solarDate: LocalDate): LocalDate
    suspend fun getSolarDateByLunaDate(lunarDate: LocalDate): LocalDate
}