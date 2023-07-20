import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        /*
        Account acc = new Account(1001, "Felipe pena", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        //UPCASTING

        Account acc1 = bacc;

        Account acc2 = new BusinessAccount(1003, "Roger guedes", 1350.00, 7500.00);

        Account acc3 = new SavingAccounts(1054, "Joao LOpes", 0.0, 800.99);

        //DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(1450.00);

        //It's not allowed, because the object acc3 is a SavingAccounts and not business account, and SavingAccount has
        // any attachment with Business account
        //BusinessAccount acc5 = (BusinessAccount) acc3;

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(14521.00);
            System.out.println("Update!!!");
        }

        if(acc3 instanceof SavingAccounts){
            SavingAccounts acc5 = (SavingAccounts) acc3;
            acc5.updateBalance();
            System.out.println("Update!!");
        }
        */
        /*Account acc7 = new Account(1201, "Abel Ferreira", 1000.00);
        acc7.withdraw(200);
        System.out.println(acc7.getBalance());


        Account acc2 = new SavingsAccount(1001, "Joao de Santo Cristo", 1000.00, 0.01);
        acc2.withdraw(200   );
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1090, "Roger Guedes", 1750.00, 1420.00);
        acc3.withdraw(1000);
        System.out.println(acc3.getBalance());
        */
        Account x = new Account(1020, "Alex Telles", 1000.0);
        Account y = new SavingsAccount(1320, "Perigozin", 1000.00, 0.10);

        x.withdraw(50);
        y.withdraw(50);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());



    }
}