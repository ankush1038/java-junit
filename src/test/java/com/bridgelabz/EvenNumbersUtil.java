package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenNumbersUtil {

    @Test
    void shouldCheckEvenNumber(){
        Assertions.assertTrue(EvenNumbers.isEven(2));
        Assertions.assertTrue(EvenNumbers.isEven(4));
        Assertions.assertTrue(EvenNumbers.isEven(6));
        Assertions.assertTrue(EvenNumbers.isEven(8));
    }

    @Test
    void shouldCheckOddNumber(){
        Assertions.assertFalse(EvenNumbers.isEven(7));
        Assertions.assertFalse(EvenNumbers.isEven(9));
    }

    // @ParameterizedTest

}
