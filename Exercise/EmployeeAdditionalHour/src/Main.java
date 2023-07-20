import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter how many employees are you going to subscribe: ");
        int n = sc.nextInt();


        for (int i = 0; i<n; i++){
            System.out.println("Employee #" + (i+1) + " Data: ");
            System.out.print("Is he outsourced ?");
            char outsourced = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Enter the name of the employee:");
            String name = sc.nextLine();
            System.out.print("Enter how many hours did he worked: ");
            int hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter his valuePerHour: ");
            double valuePerHour = sc.nextDouble();

            if(outsourced == 'y'){
                double aditionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, aditionalCharge));

            } else if (outsourced == 'n') {
                employees.add(new Employee(name, hours, valuePerHour));
            }

        }
        for (Employee emp: employees){
            System.out.println("Name: " + emp.getName() + " $- "+ String.format("%.2f",emp.payment()));
        }










        sc.close();

    }
}