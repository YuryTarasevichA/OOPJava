package org.example.Lesson6.exes3;

import java.math.BigDecimal;

public abstract class Account {
    protected abstract void deposit(BigDecimal amount);
    protected abstract void withdraw(BigDecimal amount);
}
