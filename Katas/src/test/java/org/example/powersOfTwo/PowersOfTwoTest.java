package org.example.powersOfTwo;


import org.example.Codewars.powersOfTwo.PowersOfTwo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class PowersOfTwoTest {
    PowersOfTwo powersOfTwo = new PowersOfTwo();

    public static Stream<Arguments> integerParameters() {
        return Stream.of(
                of(new long[]{1}, 0),
                of(new long[]{1, 2}, 1),
                of(new long[]{1, 2, 4}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("integerParameters")
    void setPowersOfTwo(long[] expected, int input) {
        long[] result = powersOfTwo.powersOfTwo(input);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testSomething() {
        assertArrayEquals(new long[]{1}, powersOfTwo.powersOfTwo(0));
        assertArrayEquals(new long[]{1, 2}, powersOfTwo.powersOfTwo(1));
        assertArrayEquals(new long[]{1, 2, 4, 8, 16}, powersOfTwo.powersOfTwo(4));
    }
}