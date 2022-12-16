package com.margorp.any.date.service.impl

import com.margorp.any.date.service.DateService

import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono
import java.time.LocalDate
import java.util.Date

@Service
class DateServiceImpl : DateService {

    private val publicDataEncodingKey = "2oZgjmX5voitj34%2FUianpw77PCv41zm5IQ8NDXUsDERsTAve9wzr1IDCQm7aJ2wtPMp5XH1Dy1b%2F3Rr0VQH0rw%3D%3D"
    private val publicDataDecodingKey = "2oZgjmX5voitj34/Uianpw77PCv41zm5IQ8NDXUsDERsTAve9wzr1IDCQm7aJ2wtPMp5XH1Dy1b/3Rr0VQH0rw=="

    override suspend fun solarDateToLunarDateByPublicDataApi(solarDate: LocalDate): LocalDate {
        println(solarDate)
        val url = "http://apis.data.go.kr/B090041/openapi/service/LrsrCldInfoService/getLunCalInfo"
        val client = WebClient.create(url)
        val lunarDate = client.get()
            .uri("?solYear=${solarDate.year}" +
                    "&solMonth=${solarDate.month}" +
                    "&solDay=${solarDate.dayOfMonth}" +
                    "&ServiceKey=${publicDataEncodingKey}")
            .retrieve()
            .bodyToMono(LocalDate::class.java)
            .block()
        print(lunarDate)
        return lunarDate!!
    }

    override suspend fun LunarDateToSolarDateByPublicDataApi(LunarDate: LocalDate): LocalDate {
        val url = "http://apis.data.go.kr/B090041/openapi/service/LrsrCldInfoService/getSolCalInfo"

        return LocalDate.of(2022,12,31)
    }


}