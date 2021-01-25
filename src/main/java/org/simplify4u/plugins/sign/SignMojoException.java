/*
 * Copyright 2020 Slawomir Jaranowski
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
package org.simplify4u.plugins.sign;

/**
 * Problems during mojo executing.
 * <p>
 * We extend from {@link RuntimeException} to easy use in Java stream process.
 *
 * @author Slawomir Jaranowski
 */
public class SignMojoException extends RuntimeException {

    private static final long serialVersionUID = -5595317162801384040L;

    SignMojoException(Throwable cause) {
        super(cause);
    }

    SignMojoException(String message) {
        super(message);
    }

    SignMojoException(String message, Throwable cause) {
        super(message, cause);
    }
}