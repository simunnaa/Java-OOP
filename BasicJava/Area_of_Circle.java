package BasicJava;

import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area,radius;
        System.out.print("Radius is :");
        radius=input.nextDouble();
        area=3.1416*radius*radius;
        System.out.println("The Area is :"+area);
    }
}
