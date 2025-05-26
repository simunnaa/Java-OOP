package BasicJava;

import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Array Size :");
        n=input.nextInt();
        int[] num = new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            num[i]=input.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+num[i]);
            sum=sum+num[i];
        }
        System.out.println("\n Sum is : "+sum);
        Arrays.sort(num);
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+num[i]);
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(" "+num[i]);
        }




    }
}
