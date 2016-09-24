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

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Test cases for {@link DigitalRoot}.
 *
 * @author Adam Stroud &#60;<a href="mailto:adam.stroud@gmail.com">adam.stroud@gmail.com</a>&#62;
 */
public class DigitalRootTest {

    private static final Map<Integer, Integer> TEST_DATA = new ImmutableMap.Builder<Integer, Integer>()
            .put(0, 0)
            .put(1, 1)
            .put(5, 5)
            .put(9, 9)
            .put(10, 1)
            .put(11, 2)
            .put(15, 6)
            .put(20, 2)
            .put(21, 3)
            .put(29, 2)
            .put(55, 1)
            .put(100, 1)
            .put(101, 2)
            .put(105, 6)
            .put(109, 1)
            .put(150, 6)
            .put(190, 1)
            .put(199, 1)
            .put(320, 5)
            .put(505, 1)
            .put(567, 9)
            .put(999, 9)
            .put(1000, 1)
            .put(56789, 8)
            .build();

    /**
     * Test method for {@link DigitalRoot#computeRecursive(int)}.
     */
    @Test
    public void testComputeRecursive() {
        for (int key : TEST_DATA.keySet()) {
            int expected = TEST_DATA.get(key);
            int actual =  DigitalRoot.computeRecursive(key);

            assertThat(actual, is(equalTo(expected)));
        }
    }

    /**
     * Test method for {@link DigitalRoot#computeSimple(int)}.
     */
    @Test
    public void testComputeSimple() {
        for (int key : TEST_DATA.keySet()) {
            int expected = TEST_DATA.get(key);
            int actual =  DigitalRoot.computeSimple(key);

            assertThat(actual, is(equalTo(expected)));
        }
    }
}