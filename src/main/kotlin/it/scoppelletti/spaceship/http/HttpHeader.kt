/*
 * Copyright (C) 2017 Dario Scoppelletti, <http://www.scoppelletti.it/>.
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

package it.scoppelletti.spaceship.http

/**
 * HTTP headers.
 *
 * @since 1.0.0
 */
public object HttpHeader {

    /**
     * Header containing the client application name and version.
     */
    public const val APPL: String = "scoppelletti-appl"

    /**
     * Header `Authorization`.
     */
    public const val AUTH: String = "Authorization"

    /**
     * Authorization type `Bearer`.
     */
    public const val AUTH_BEARER: String = "Bearer"

    /**
     * Header `Accept-Language`.
     */
    public const val LOCALE: String = "Accept-Language"

    /**
     * Header containing the client OS name and version.
     */
    public const val OS: String = "scoppelletti-os"

    /**
     * Header containing the client timezone.
     */
    public const val TIMEZONE: String = "scoppelletti-Timezone-IANA"

    /**
     * Sets the header `Content-Type` to the media-type `application/json`.
     */
    public const val CONSUMES_JSON: String = "Content-Type: application/json"

    /**
     * Sets the header `Accept` to the media-type `application/json`.
     */
    public const val PRODUCES_JSON: String = "Accept: application/json"
}