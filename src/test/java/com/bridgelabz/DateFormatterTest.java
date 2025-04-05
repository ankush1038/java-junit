package com.bridgelabz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

public class DateFormatterTest {

    @Test
    void shouldFormatValidDate() throws ParseException {
        String result = DateFormatter.formatDate("2024-04-03");
        assertEquals("03-04-2024", result);
    }

    @Test
    void shouldThrowExceptionForInvalidDateFormat() {
        assertThrows(ParseException.class, () -> {
            DateFormatter.formatDate("03/04/2024");
        });
    }

    @Test
    void shouldThrowExceptionForInvalidDateValue() {
        assertThrows(ParseException.class, () -> {
            DateFormatter.formatDate("2024-02-30"); // Feb 30 does not exist
        });
    }
}
