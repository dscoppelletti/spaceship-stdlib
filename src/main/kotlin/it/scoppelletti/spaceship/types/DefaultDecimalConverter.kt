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

import it.scoppelletti.spaceship.i18n.I18NProvider
import java.text.NumberFormat

/**
 * Default implementation of `DecimalConverter` interface.
 *
 * @since 1.0.0
 *
 * @constructor                Constructor.
 * @param       fractionDigits Number of digits in the fraction portion of a
 *                             number.
 * @param       groupingUsed   Whether grouping will be used in this converter.
 * @param       i18nProvider   Provides I18N dependencies.
 */
public class DefaultDecimalConverter(
        fractionDigits: Int?,
        groupingUsed: Boolean?,
        i18nProvider: I18NProvider
) : AbstractDecimalConverter(fractionDigits, groupingUsed, i18nProvider) {

    override fun defaultFractionDigits(format: NumberFormat): Int =
            format.maximumFractionDigits
}