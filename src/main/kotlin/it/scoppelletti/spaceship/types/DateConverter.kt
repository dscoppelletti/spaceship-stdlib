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

import org.threeten.bp.LocalDate
import org.threeten.bp.format.DateTimeParseException

/**
 * Conversion between dates and strings.
 *
 * @since 1.0.0
 */
public interface DateConverter {

    /**
     * Formats a date as a string.
     *
     * @param  value Date.
     * @return       Corresponding string.
     */
    public fun format(value: LocalDate?): String?

    /**
     * Parses a string as a date.
     *
     * @param  text String.
     * @return      Resulting date.
     */
    @Throws(DateTimeParseException::class)
    public fun parse(text: String?): LocalDate?

    /**
     * Returns the pattern for formatting dates.
     *
     * @return User notation of the pattern.
     */
    public fun pattern(): String
}