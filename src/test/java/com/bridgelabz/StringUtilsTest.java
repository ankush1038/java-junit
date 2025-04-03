package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testReverse() {
        Assertions.assertEquals("olleH", StringUtils.reverse("Hello"));
        Assertions.assertEquals("avaJ", StringUtils.reverse("Java"));
        Assertions.assertEquals("", StringUtils.reverse(""));

    }

    @Test
    public void testIsPalindrome() {
        Assertions.assertTrue(StringUtils.isPalindrome("madam"));
        Assertions.assertTrue(StringUtils.isPalindrome("racecar"));
        Assertions.assertFalse(StringUtils.isPalindrome("hello"));
        Assertions.assertTrue(StringUtils.isPalindrome("Malayalam")); // Case insensitive check

    }

    @Test
    public void testToUpperCase(){
        Assertions.assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        Assertions.assertEquals("JAVA", StringUtils.toUpperCase("Java"));   // Mixed case
        Assertions.assertEquals("WORLD", StringUtils.toUpperCase("WORLD")); // Already uppercase
        Assertions.assertEquals("", StringUtils.toUpperCase(""));           // Empty string case

    }
}

