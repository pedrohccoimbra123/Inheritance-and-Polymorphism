package entities;

public class SavingAccounts extends Account {
    private Double interestRate;


    public Double getInterestRate() {
        return interestRate;
    }
    public SavingAccounts(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingAccounts() {
        super();

    }

    public void updateBalance(){
        balance += balance*interestRate;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
