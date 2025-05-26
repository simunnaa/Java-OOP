package BasicJava;

import java.util.Scanner;

public class Celcius_to_Farn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celcius,farn;
        System.out.print("Enter the Celcius :");
        celcius=input.nextDouble();
        farn=1.8*celcius + 32;
        System.out.println("Farn is :"+farn);
    }
}
