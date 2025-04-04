package com.bridgelabz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {

    private DatabaseConnection db;

    @BeforeEach
    void setup(){
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void tearDown(){
        db.disconnect();
    }

    @Test
    void shouldCheckConnectionToDatabase(){
        Assertions.assertTrue(db.isConnected());
    }
}
