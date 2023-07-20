package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Account acc1 = new Account(1001, "Chris", 1000.00);

        List<Account> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount(1002, "Alex telles", 1000.00, 0.01));

        accounts.add(new BusinessAccount(1001, "Abel ferreira", 1540.00, 200.00));
        accounts.add(new SavingsAccount(1004, "bob marley", 1450.00, 0.04));
        accounts.add(new BusinessAccount(1005, "Chris Brown", 1005.00, 150.00));


        double sum = 0.0;

        for(Account acc: accounts){
            sum += acc.getBalance();

        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc: accounts){
            acc.deposit(1000.00);
        }
        for(Account acc: accounts){
            System.out.printf("\nUpdated balance for account %d: %.2f", acc.getNumber(), acc.getBalance());

        }



   }
}