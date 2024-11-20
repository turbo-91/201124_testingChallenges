package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void summe_expect20_when10Plus10() {
        // GIVEN
        int a = 10;
        int b = 10;
        int expectedSum = 20;
        // WHEN
        int actualSum = Main.summe(a, b);
        // THEN
        Assertions.assertEquals(expectedSum, actualSum);
    }

    // Write a test for a method that calculates the sum of two integers.
    @Test
    void calculatesSumTwoIntegers() {
        // GIVEN
        int a = 10;
        int b = 10;
        int expectedSum = 20;
        // WHEN
        int actualSum = Main.summe(a, b);
        // THEN
        Assertions.assertEquals(expectedSum, actualSum);
    }

    // Write a test for a method that checks if a given number is even.
    @Test
    void isEven_false_77() {
        //GIVEN
        int number = 77;
        //WHEN
        boolean result = Main.isEven(number);
        //THEN
        assertFalse(result);
    }

    // Write a test for a method
    // that calculates the product of two integers.
    @Test
    void calculatesProductTwoIntegers() {
        // GIVEN
        int a = 1;
        int b = 2;
        // WHEN
        int result = Main.product(a, b);
        // THEN
        Assertions.assertEquals(result, b);
    }

    // Write a test for a method
    // that converts a given string to uppercase.
    @Test
    void testToUpperCase() {
        // GIVEN
        String str = "torben ist cool";
        // WHEN
        String result = Main.toUpperCase(str);
        // THEN
        Assertions.assertEquals("TORBEN IST COOL", result);
    }

    // Write a test for a method that
    // checks if a given number is positive.
    @Test
    void testIsPositive(){
        // GIVEN
        int number = 73934790;
        // WHEN
        boolean result = Main.isPositive(number);
        // THEN
        Assertions.assertTrue(result);
    }



}