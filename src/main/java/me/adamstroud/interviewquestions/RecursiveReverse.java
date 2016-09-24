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
 * Problem: Take a string and output a string with the characters in reverse order using a recursive solution.
 *
 * @author Adam Stroud &#60;<a href="mailto:adam.stroud@gmail.com">adam.stroud@gmail.com</a>&#62;
 */
public class RecursiveReverse {
    public static String reverse(String string) {
        if (string != null && !string.isEmpty()) {
            return reverse(string, 0);
        } else {
            return string;
        }
    }

    private static String reverse(String string, int position) {
        char currentChar = string.charAt(position);

        if (position == string.length() - 1) {
            return String.valueOf(currentChar);
        } else {
            return reverse(string, position + 1) + currentChar;
        }
    }
}
