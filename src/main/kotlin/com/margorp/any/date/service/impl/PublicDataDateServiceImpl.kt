package com.margorp.any.date.service.impl

import com.margorp.any.date.client.DateClient
import com.margorp.any.date.service.DateService

import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class PublicDataDateServiceImpl(
        /*@Autowired*/val dateClient: DateClient
): DateService {
    override suspend fun solarDateToLunarDate(solarDate: LocalDate): LocalDate {
        dateClient.getLunaDateBySolarDate(solarDate)
        return LocalDate.of(solarDate.year, solarDate.month, solarDate.dayOfMonth)
    }

    override suspend fun LunarDateTosolarDate(LunarDate: LocalDate): LocalDate {
        return LocalDate.of(2022,12,31)
    }


}