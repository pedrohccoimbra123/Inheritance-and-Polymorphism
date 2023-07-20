package entities;

import entities.Account;

public  class SavingsAccount extends Account {
    private Double interestRate;


    public Double getInterestRate() {
        return interestRate;
    }
    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public SavingsAccount() {
        super();

    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance*interestRate;
    }

    @Override
    public final void withdraw(double amount) {
        balance -= amount;
    }
}

