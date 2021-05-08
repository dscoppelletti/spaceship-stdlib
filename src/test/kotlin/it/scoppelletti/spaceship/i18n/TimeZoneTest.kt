package it.scoppelletti.spaceship.i18n

import java.time.LocalDateTime
import java.time.ZoneId
import kotlin.test.Test
import kotlin.test.assertEquals

class TimeZoneTest {

    private var utc = ZoneId.of("UTC")
    private var currentZone = ZoneId.of("UTC+2")

    @Test
    fun defaultZone() {
        println(ZoneId.systemDefault().id)
    }

    @Test
    fun currentToUtc() {
        val time = LocalDateTime.of(1972, 2, 26, 14, 15)
        val zonedTime = time.atZone(currentZone)
        assertEquals(time.year, zonedTime.year, "Year")
        assertEquals(time.monthValue, zonedTime.monthValue, "Month")
        assertEquals(time.dayOfMonth, zonedTime.dayOfMonth, "Day")
        assertEquals(time.hour, zonedTime.hour, "Hour")
        assertEquals(time.minute, zonedTime.minute, message = "Minute")

        val utcTime = zonedTime.withZoneSameInstant(utc)
        assertEquals(time.year, utcTime.year, "Year")
        assertEquals(time.monthValue, utcTime.monthValue, "Month")
        assertEquals(time.dayOfMonth, utcTime.dayOfMonth, "Day")
        assertEquals(time.hour - 2, utcTime.hour, "Hour")
        assertEquals(time.minute, utcTime.minute, message = "Minute")
    }

    @Test
    fun utcToCurrent() {
        val time = LocalDateTime.of(1972, 2, 26, 14, 15)
        val zonedTime = time.atZone(utc)
        assertEquals(time.year, zonedTime.year, "Year")
        assertEquals(time.monthValue, zonedTime.monthValue, "Month")
        assertEquals(time.dayOfMonth, zonedTime.dayOfMonth, "Day")
        assertEquals(time.hour, zonedTime.hour, "Hour")
        assertEquals(time.minute, zonedTime.minute, message = "Minute")

        val currentTime = zonedTime.withZoneSameInstant(currentZone)
        assertEquals(time.year, currentTime.year, "Year")
        assertEquals(time.monthValue, currentTime.monthValue, "Month")
        assertEquals(time.dayOfMonth, currentTime.dayOfMonth, "Day")
        assertEquals(time.hour + 2, currentTime.hour, "Hour")
        assertEquals(time.minute, currentTime.minute, message = "Minute")
    }
}