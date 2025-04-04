package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ArithmeticExceptionTest {
    @Test
    public void shouldThrowArithematicExceptionWhenDividingByZero(){
        Assertions.assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                ArithematicExceptionClass.divide(100,0);
            }
        });
    }

}
