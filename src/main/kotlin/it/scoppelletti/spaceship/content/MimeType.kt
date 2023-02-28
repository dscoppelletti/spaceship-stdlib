/*
 * Copyright (C) 2021 Dario Scoppelletti, <http://www.scoppelletti.it/>.
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

package it.scoppelletti.spaceship.content

/**
 * MIME types.
 *
 * @since 1.0.0
 */
public object MimeType {

    /**
     * `image&#47;*`
     */
    public const val IMAGE: String = "image/*"

    /**
     * `text/plain`
     */
    public const val TEXT_PLAIN: String = "text/plain"

    /**
     * `application/octet-stream`
     */
    public const val STREAM: String = "application/octet-stream"

    /**
     * `video&#47;*`
     */
    public const val VIDEO: String = "video/*"
}