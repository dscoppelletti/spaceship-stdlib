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

@file:Suppress("unused")

package it.scoppelletti.spaceship.http

/**
 * Operations for HTTP protocol.
 *
 * @since 1.0.0
 */
public object HttpExt {

    /**
     * Authorization type `Bearer`.
     */
    public const val AUTH_BEARER: String = "Bearer"

    /**
     * Sets the header `Content-Type` to the media-type `application/json`.
     */
    public const val CONSUMES_JSON: String = "Content-Type: application/json"

    /**
     * Name of the `Interceptor` dependency that decorates an HTTP request with
     * infos describing the client.
     */
    public const val DEP_CLIENTINTERCEPTOR: String =
            "it.scoppelletti.spaceship.http.1"

    /**
     * Header containing the client application name and version.
     */
    public const val HEADER_APPL: String = "scoppelletti-appl"

    /**
     * Header `Authorization`.
     */
    public const val HEADER_AUTH: String = "Authorization"

    /**
     * Header `Accept-Language`.
     */
    public const val HEADER_LOCALE: String = "Accept-Language"

    /**
     * Header containing the client OS name and version.
     */
    public const val HEADER_OS: String = "scoppelletti-os"

    /**
     * Sets the header `Accept` to the media-type `application/json`.
     */
    public const val PRODUCES_JSON: String = "Accept: application/json"

    /**
     * HTTP status Unauthorized.
     */
    public const val STATUS_UNAUTHORIZED: Int = 401

    /**
     * HTTP status Forbidden.
     */
    public const val STATUS_FORBIDDEN: Int = 403

    /**
     * HTTP status Not Found.
     */
    public const val STATUS_NOTFOUND: Int = 404
}
