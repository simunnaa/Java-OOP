package BasicJava;

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter First Number :");
        num1=input.nextInt();
        System.out.print("Enter Second  Number :");
        num2=input.nextInt();
        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1*num2;
        int div = num1/num2;
        int mod = num1%num2;
        System.out.println("Addition is : "+add);
        System.out.println("Subtract is :"+sub);
        System.out.println("Multipiclation is :"+mul);
        System.out.println("Division is :"+div);
        System.out.println("Modolus is :"+mod);


    }
}
