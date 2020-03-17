/*
 * Copyright 2009-2017 java-diff-utils.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.difflib.algorithm;

/**
 * Thrown whenever the differencing engine cannot produce the differences between two revisions of ta text.
 *
 * @see com.github.difflib.algorithm.myers.MyersDiff
 * @see DiffAlgorithmI
 */
public class DifferentiationFailedException extends DiffException {

    private static final long serialVersionUID = 1L;

    public DifferentiationFailedException() {
    }

    public DifferentiationFailedException(String msg) {
        super(msg);
    }
}
