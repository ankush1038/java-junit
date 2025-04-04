package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


import java.util.concurrent.TimeUnit;

public class PerformanceTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void shouldTimeoutAfterLongRun(){
        Performance service = new Performance();
        String result = service.longRunnigTask();
        Assertions.assertEquals("Task Completed",result);
    }
}
