package application;

import entities.JuridicPerson;
import entities.Person;
import entities.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            System.out.println("Tax payer #" + (i+1)+ " :");
            System.out.println("Individual or Company?");
            char cha = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Enter the name: ");
            String name = sc.nextLine();
            System.out.print("Enter the income: ");
            double anualIncome = sc.nextDouble();

            if (cha == 'i'){
                System.out.print("Enter the healthy expensives: ");
                double healthyCost = sc.nextDouble();

                list.add(new PhysicalPerson(name, anualIncome, healthyCost));

            }else if (cha == 'c'){
                System.out.print("Enter the number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new JuridicPerson(name, anualIncome, numberOfEmployees));

            }else{
                System.out.println("Wrong option.");
            }

        }

        System.out.println();
        System.out.println("TAXES PAID: ");


        for (Person p: list){
            System.out.println("Name: "+ p.getName() + " Tax: " + String.format("%.2f",p.taxIncome()));
        }

        System.out.println();
        double sum = 0.0;
        for (Person p: list){
            sum+= p.taxIncome();
        }

        System.out.println("Total taxes: " + String.format("%.2f",sum));
        






        sc.close();


    }
}