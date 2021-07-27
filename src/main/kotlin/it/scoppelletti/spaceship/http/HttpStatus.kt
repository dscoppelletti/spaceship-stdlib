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

public object HttpStatus {

    /**
     * Unauthorized.
     */
    public const val UNAUTHORIZED: Int = 401

    /**
     * Forbidden.
     */
    public const val FORBIDDEN: Int = 403

    /**
     * Not Found.
     */
    public const val NOTFOUND: Int = 404
}