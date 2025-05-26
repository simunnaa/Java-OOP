package BasicJava;

import java.util.Scanner;

public class if_Else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the Number :");
        n = input.nextInt();
        if(n%2==0)
        {
            System.out.println("The number is Even");

        }
        else {
            System.out.println("The number is odd");
        }
    }
}
