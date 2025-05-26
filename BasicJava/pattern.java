package BasicJava;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter row number :");
        n=input.nextInt();

        for(int row=1;row<=n;row++)
        {
            for(int col=row;col>=1;col--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
