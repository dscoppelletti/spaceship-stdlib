/*
 * Copyright (C) 2019 Dario Scoppelletti, <http://www.scoppelletti.it/>.
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

import java.time.LocalTime
import java.time.format.DateTimeParseException

/**
 * Conversion between times and strings.
 *
 * @since 1.0.0
 */
public interface TimeConverter {

    /**
     * Formats a time as a string.
     *
     * @param  value Time.
     * @return       Corresponding string.
     */
    public fun format(value: LocalTime?): String?

    /**
     * Parses a string as a time.
     *
     * @param  text String.
     * @return      Resulting time.
     */
    @Throws(DateTimeParseException::class)
    public fun parse(text: String?): LocalTime?

    /**
     * Returns the pattern for formatting times.
     *
     * @return User notation of the pattern.
     */
    public fun pattern(): String

    /**
     * Returns `true` if times should be formatted as 24 hour times, `false` if
     * times should be formatted as 12 hour (AM/PM) times.
     */
    public fun is24HourFormat(): Boolean
}