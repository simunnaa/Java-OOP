package BasicJava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number :");
        n=input.nextInt();
        int fibo;
        int first=0;
        int second=1;
        System.out.print(first + " "+ second);
        for(int i=0;i<n;i++)
        {
            fibo=first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
        }
    }
}
