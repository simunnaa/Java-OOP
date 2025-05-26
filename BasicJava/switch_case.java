package BasicJava;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;
        System.out.println("Enter the Value");
        value = input.nextInt();
        switch(value)
        {
            case 0 :
            {
                System.out.println("Zero");
            }
            case 1:
            {
                System.out.println("One");
            }
            case 2:
            {
                System.out.println("Two");
            }
            default :
            {
                System.out.println("Null");
                break;
            }
        }

    }
}
