package com.margorp.any.date.client.impl

import com.margorp.any.date.client.DateClient

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody
import java.time.LocalDate



/*
    getLunCalInfo : 음력일정보조회
    getSolCalInfo : 음력일정보조회
    getSpcifyLunCalInfo : 특정 음력일 정보조회
    getJulDayInfo : 율리우스적일 정보조호
 */
@Component
class PublicDataDateClientImpl: DateClient {

    private val URL = "http://apis.data.go.kr/B090041/openapi/service/LrsrCldInfoService"
    private val KEY = "2oZgjmX5voitj34%2FUianpw77PCv41zm5IQ8NDXUsDERsTAve9wzr1IDCQm7aJ2wtPMp5XH1Dy1b%2F3Rr0VQH0rw%3D%3D"

    override suspend fun getLunaDateBySolarDate(solarDate: LocalDate): String {
        val uri = "${URL}/getLunCalInfo?solYear=${solarDate.year}&solMonth=${solarDate.month}&solDay=${solarDate.dayOfMonth}&ServiceKey=${KEY}"
        val result = WebClient.create().get().uri(uri).retrieve().awaitBody<String>()

        return result
        //return LocalDate.of(solarDate.year,solarDate.month,solarDate.dayOfMonth)
    }

    override suspend fun getSolarDateByLunaDate(lunarDate: LocalDate): LocalDate {
        TODO("Not yet implemented")
    }
}