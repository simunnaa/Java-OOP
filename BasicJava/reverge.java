package BasicJava;

import java.util.Scanner;

public class reverge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the number :");
        n=input.nextInt();
        int rev=0;
        int tmp=n;
        int r;
        while(tmp!=0)
        {
            r=tmp%10;
            rev=rev*10+r;
            tmp=tmp/10;
        }
        System.out.println("Sum Of digit :"+rev);
        if(n==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }



    }
}


