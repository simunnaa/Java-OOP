package BasicJava;

import java.util.Scanner;

public class prime_number
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        int cnt=0;
        System.out.print("Enter initial number :");
        n=input.nextInt();
        System.out.print("Enter final number :");
        m=input.nextInt();
        System.out.println("Prime numbers are :");

        for(int i=n;i<=m;i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i%j==0) {

                    cnt++;
                    break;

                }
            }

            if (cnt == 0) {
                System.out.print(i + " ");
            }
            cnt=0;
        }

    }
}
