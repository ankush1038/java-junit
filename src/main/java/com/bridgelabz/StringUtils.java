package com.bridgelabz;


public class StringUtils {

    // Method to reverse a string
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed); // Case-insensitive comparison
    }

    // Method to convert a string to uppercase
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
}