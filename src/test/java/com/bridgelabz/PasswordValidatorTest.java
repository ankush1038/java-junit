package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    void shouldTestPasswordValidOrNot(){
        Assertions.assertTrue(PasswordValidator.isValid("Password1"));
        Assertions.assertTrue(PasswordValidator.isValid("Hello123"));
    }

    @Test
    void shouldCheckLength(){
        Assertions.assertFalse(PasswordValidator.isValid("Ank1")); // too short
    }

    @Test
    void shouldCheckUppercase(){
        Assertions.assertFalse(PasswordValidator.isValid("password1")); // No uppercase character
    }

    @Test
    void shouldCheckDigitPresence(){
        Assertions.assertFalse(PasswordValidator.isValid("Password")); // no digit present
    }
}
