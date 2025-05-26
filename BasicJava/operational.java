package BasicJava;

import java.util.Scanner;

public class operational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter a Character");
        ch = input.next().charAt(0);
//        if(ch =='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u')
//        {
//            System.out.println("The char is Vowel");
//        }
//        else
//        {
//            System.out.println("The char is Consonent");
//        }
        if(ch>='a' && ch<='z')
        {
            System.out.println("Small Letter");
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("Capital Letter");
        }
        else
        {
            System.out.println("No Letter");
        }
    }
}
