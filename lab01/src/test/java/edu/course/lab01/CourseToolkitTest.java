
package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseToolkitTest {

    // =========================
    // 1. Тесты метода isEven
    // =========================

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);
        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);
        assertFalse(result);
    }

    @Test
    void returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);
        assertTrue(result);
    }

    @Test
    void returnsTrueForZero() {
        boolean result = CourseToolkit.isEven(0);
        assertTrue(result);
    }

    // =========================
    // 2. Тесты метода isPrime
    // =========================

    @Test
    void returnsFalseForNumberLessThanTwo() {
        assertFalse(CourseToolkit.isPrime(1));
    }

    @Test
    void returnsFalseForNegativeNumber() {
        assertFalse(CourseToolkit.isPrime(-5));
    }

    @Test
    void returnsTrueForTwo() {
        assertTrue(CourseToolkit.isPrime(2));
    }

    @Test
    void returnsTrueForPrimeNumber() {
        assertTrue(CourseToolkit.isPrime(17));
    }

    @Test
    void returnsFalseForCompositeNumber() {
        assertFalse(CourseToolkit.isPrime(12));
    }

    @Test
    void returnsFalseForSquareOfPrime() {
        assertFalse(CourseToolkit.isPrime(49));
    }

    // =========================
    // 3. Тесты isPalindrome
    // =========================

    @Test
    void returnsTrueForPalindrome() {
        assertTrue(CourseToolkit.isPalindrome("level"));
    }

    @Test
    void returnsFalseForNonPalindrome() {
        assertFalse(CourseToolkit.isPalindrome("hello"));
    }

    @Test
    void respectsCharacterCase() {
        assertFalse(CourseToolkit.isPalindrome("Level"));
    }

    @Test
    void respectsSpaces() {
        assertFalse(CourseToolkit.isPalindrome("a a "));
    }

    @Test
    void rejectsNullText() {
        assertThrows(
                IllegalArgumentException.class,
                () -> CourseToolkit.isPalindrome(null)
        );
    }

    @Test
    void acceptsEmptyString() {
        assertTrue(CourseToolkit.isPalindrome(""));
    }

    // =========================
    // 4. Тесты метода average
    // =========================

    @Test
    void calculatesAverage() {
        int[] values = {1, 2, 4};

        double result = CourseToolkit.average(values);

        assertEquals(7.0 / 3, result, 0.000001);
    }

    @Test
    void calculatesAverageForNegativeNumbers() {
        int[] values = {-2, -4, -6};

        double result = CourseToolkit.average(values);

        assertEquals(-4.0, result, 0.000001);
    }

    @Test
    void rejectsEmptyArray() {
        int[] values = {};

        assertThrows(
                IllegalArgumentException.class,
                () -> CourseToolkit.average(values)
        );
    }

    @Test
    void rejectsNullArray() {
        assertThrows(
                IllegalArgumentException.class,
                () -> CourseToolkit.average(null)
        );
    }

    @Test
    void doesNotModifyInputArray() {
        int[] values = {5, 10, 15};
        int[] expected = {5, 10, 15};

        CourseToolkit.average(values);

        assertArrayEquals(expected, values);
    }
}

