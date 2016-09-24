/*
 * Copyright 2016 Adam Stroud
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
package me.adamstroud.interviewquestions;

/**
 * Problem: Compute the digital root of a number. This class contain both the simple and recursive solutions.
 *
 * @author Adam Stroud &#60;<a href="mailto:adam.stroud@gmail.com">adam.stroud@gmail.com</a>&#62;
 */
public class DigitalRoot {
    private static final int BASE = 10;

    public static int computeSimple(int value) {
        return (1 + ((value - 1) % 9));
    }

    public static int computeRecursive(int value) {
        int digitalRoot = computeRecursive(0, value);

        if (digitalRoot >= BASE) {
            digitalRoot = computeRecursive(digitalRoot);
        }

        return digitalRoot;
    }

    private static int computeRecursive(int place, int value) {
        if (value < BASE) {
            return value;
        } else {
            int digit = value % BASE;
            return digit + computeRecursive((place + 1), value / BASE);
        }
    }
}