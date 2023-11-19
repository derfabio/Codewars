package org.example.reverse;

import org.example.Codewars.reverse.Reverse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.of;

class ReverseTest {
    Reverse reverse = new Reverse();

    public static Stream<Arguments> stringParameters() {
        return Stream.of(
                of("krishan", "nahsirk")
        );
    }

    @ParameterizedTest
    @MethodSource("stringParameters")
    void setReverse(String expected, String input) {
        String result = reverse.reverseLetter(input);

        assertEquals(expected, result);
    }

    @Test
    void reverseLetter() {
        doTest("krishan", "nahsirk");
        doTest("ultr53o?n", "nortlu");
        doTest("ab23c", "cba");
        doTest("krish21an", "nahsirk");
    }
    private void doTest(final String str, final String expected) {
        assertEquals(expected, reverse.reverseLetter(str));
    }
}