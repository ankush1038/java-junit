package com.bridgelabz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testDepositUpdatesBalanceCorrectly() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void testWithdrawUpdatesBalanceCorrectly() {
        BankAccount account = new BankAccount();
        account.deposit(1500);
        account.withdraw(500);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void testWithdrawFailsIfInsufficientFunds() {
        BankAccount account = new BankAccount();
        account.deposit(300);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(500);
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    void testDepositNegativeAmountThrowsException() {
        BankAccount account = new BankAccount();
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
    }

    @Test
    void testWithdrawNegativeAmountThrowsException() {
        BankAccount account = new BankAccount();
        account.deposit(500);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-50));
    }
}