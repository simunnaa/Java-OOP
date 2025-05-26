package BasicJava;

import java.util.Scanner;

public class Area_of_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height,base;
        System.out.print("Enter the height :");
        height=input.nextInt();
        System.out.print("Enter the base :");
        base=input.nextInt();
        double Area = 0.5*height*base;
        System.out.println("Area is :"+Area);
    }
}
