/*
 * Copyright (C) 2018 Dario Scoppelletti, <http://www.scoppelletti.it/>.
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

package it.scoppelletti.spaceship.io

import java.io.File

/**
 * Provides I/O components.
 *
 * @since 1.0.0
 *
 * @property noBackupFilesDir Absolute path to the directory on the filesystem
 *                            where all private files belonging to this
 *                            application are stored. On device runnning
 *                            `LOLLIPOP` or later, the files placed under this
 *                            directory will be excluded from automatic backup
 *                            to remote storage.
 */
public interface IOProvider {

    public val noBackupFilesDir: File
}
