package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenNumbersUtil {


//    void shouldCheckEvenNumber(){
//        Assertions.assertTrue(EvenNumbers.isEven(2));
//        Assertions.assertTrue(EvenNumbers.isEven(4));
//        Assertions.assertTrue(EvenNumbers.isEven(6));
//        Assertions.assertTrue(EvenNumbers.isEven(8));
//    }
//
//    @Test
//    void shouldCheckOddNumber(){
//        Assertions.assertFalse(EvenNumbers.isEven(7));
//        Assertions.assertFalse(EvenNumbers.isEven(9));
//    }


    @ValueSource( ints = {2,4,6,8})

    void shouldCheckEvenNumber(int number){
        Assertions.assertTrue(EvenNumbers.isEven(number));
    }

    @ParameterizedTest
    @ValueSource( ints = {7,9})
    void shouldCheckOddNumber(int number){
        Assertions.assertFalse(EvenNumbers.isEven(number));
    }

}
