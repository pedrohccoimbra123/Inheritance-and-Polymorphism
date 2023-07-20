import entities.Product;
import entities.UsedProduct;
import entities.ImportedProduct;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        System.out.print("How many products do you want to castrate: ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Data of the #" + (i + 1) + " product");
            System.out.print("Enter the name of the product: ");
            String name = sc.nextLine();
            System.out.print("Enter the price of the product: ");
            double price = sc.nextDouble();


            System.out.println("Enter \nc: common product\nu: used product\ni: imported product");
            char type = sc.next().toLowerCase().charAt(0);

            if (type == 'c') {
                list.add(new Product(name, price));
            } else if (type == 'u') {
                System.out.println("Enter the manufactured date: (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            } else if (type == 'i') {
                System.out.println("Enter the customs Fee for imported products");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            } else {
                System.out.println("Invalid option, try again\nC: common\nU: Used Product\nI: Imported Product");
                type = sc.next().toLowerCase().charAt(0);
                if (type == 'c') {
                    list.add(new Product(name, price));
                } else if (type == 'u') {
                    System.out.println("Enter the manufactured date: (DD/MM/YYYY): ");
                    LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    list.add(new UsedProduct(name, price, date));
                } else if (type == 'i') {
                    System.out.println("Enter the customs Fee for imported products");
                    double customsFee = sc.nextDouble();
                    list.add(new ImportedProduct(name, price, customsFee));
                }
            }
            System.out.println();

            System.out.println("Price tag: ");

            for (Product prod : list) {
                System.out.println(prod.priceTag());

            }


            sc.close();

        }
    }
}
