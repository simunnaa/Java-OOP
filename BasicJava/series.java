package BasicJava;

import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n;
        System.out.println("Enter the Number :");
        n= input.nextDouble();
        int sum=0;
        int mul=1;
        int oddsum=0;
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
            sum=sum+i;
            mul=mul*i;
            if(i%2!=0)
            {
                oddsum=oddsum+i;
            }
        }
        System.out.println();
        System.out.println("Sum is :"+sum);
        System.out.println("Mul is :"+mul);
        System.out.println("Oddsum is :"+oddsum);
    }
}
