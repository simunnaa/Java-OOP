package BasicJava;

import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        System.out.println("Enter First one");
        x=input.nextInt();
        System.out.println("Enter Second One");
        y=input.nextInt();
        int max=Math.max(x,y);
        System.out.println("Max is "+max);
        int min=Math.min(x,y);
        System.out.println("Min is "+min);
        double pow = Math.pow(x,y);
        System.out.println("Power is "+pow);

    }
}
