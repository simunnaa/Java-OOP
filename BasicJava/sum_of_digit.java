package BasicJava;

import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the number :");
        n=input.nextInt();
        int sum=0;
        int tmp=n;
        int r;
        while(tmp!=0)
        {
            r=tmp%10;
            sum=sum+r;
            tmp=tmp/10;
        }
        System.out.println("Sum Of digit :"+sum);



    }
}
