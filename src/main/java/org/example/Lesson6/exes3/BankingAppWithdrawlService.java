package org.example.Lesson6.exes3;

import java.math.BigDecimal;

public class BankingAppWithdrawlService {
    private Account account;
    private FixedTearmDepositAccount fixedTearmDepositAccount;

    public BankingAppWithdrawlService(Account account) {
        this.account = account;
    }

    public BankingAppWithdrawlService(FixedTearmDepositAccount fixedTearmDepositAccount) {
        this.fixedTearmDepositAccount = fixedTearmDepositAccount;
    }

    public void withdraw(BigDecimal amount){
        account.withdraw(amount);
    }
}
