package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();


        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.printf("Shape #%d data: ", (i+1));
            sc.nextLine();
            System.out.print("Is it a rectangle or circle (r/c):");
            char sh = sc.next().toLowerCase().charAt(0);
            System.out.print("What is the color: (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (sh == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));

            }else if (sh == 'c'){
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));

            }else {
                System.out.println("Incorrect shape");

            }
        }

        System.out.println();
        System.out.println("Area of the shapes: ");
        for (Shape shape: list){
            System.out.printf("%.2f%n",shape.area());
        }



        sc.close();


    }
}