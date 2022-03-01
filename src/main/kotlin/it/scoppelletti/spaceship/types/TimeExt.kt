/*
 * Copyright (C) 2022 Dario Scoppelletti, <http://www.scoppelletti.it/>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package it.scoppelletti.spaceship.types

import java.time.Clock
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.ZonedDateTime

/**
 * Operations on dates and time.
 *
 * @since 1.0.0
 */
public object TimeExt {

    /**
     * UTC zone.
     */
    public val ZONE_UTC: ZoneId = Clock.systemUTC().zone
}

/**
 * Converts this date to the number of milliseconds from the epoch of
 * 1970-01-01T00:00:00Z.
 *
 * This combines this local date and the UTC zone offset to calculate the
 * epoch-millisecond value, which is the number of elapsed seconds from
 * 1970-01-01T00:00:00Z. Instants on the time-line after the epoch are positive,
 * earlier are negative.
 *
 * @receiver The local date.
 * @return   The corresponding number of milliseconds from 1970-01-01T00:00:00Z.
 * @since    1.0.0
 */
public fun LocalDate.toEpochMilli(): Long = this.atStartOfDay()
    .atZone(TimeExt.ZONE_UTC).toEpochSecond() * 1000L

/**
 * Obtains an instance of `LocalDate` using milliseconds from the epoch of
 * 1970-01-01T00:00:00Z.
 *
 * @param  epochMilli The number of milliseconds from 1970-01-01T00:00:00Z.
 * @return            The corresponding `LocalDate`.
 * @since             1.0.0
 */
public fun epochMilliToLocalDate(epochMilli: Long): LocalDate =
    ZonedDateTime.ofInstant(Instant.ofEpochMilli(epochMilli), TimeExt.ZONE_UTC)
        .toLocalDate()