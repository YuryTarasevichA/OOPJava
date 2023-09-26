package org.example.Lesson6.exes3;

import java.math.BigDecimal;

public class FixedTearmDepositAccount extends Account {

    /**
     * @param amount
     */
    @Override
    protected void deposit(BigDecimal amount) {
        // Deposit into this account
    }

    /**
     * @param amount
     */
    @Override
    protected void withdraw(BigDecimal amount) {
        throw new UnsupportedOperationException();
    }
}
