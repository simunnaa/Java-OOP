package BasicJava;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        String name;
        double num2;
        System.out.println("Hello, Whats your name ");
        name = input.nextLine();
        System.out.println("enter the number ");
        num1 = input.nextInt();
        System.out.println("enter another number ");
        num2 = input.nextDouble();


        System.out.println("My name is ,"+name);
        System.out.println("Num1 is : "+num1);
        System.out.println("Num2 is :"+num2);


    }
}
