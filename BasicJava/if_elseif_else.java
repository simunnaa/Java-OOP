package BasicJava;

import java.util.Scanner;

public class if_elseif_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter the Character : ");
        ch = input.next().charAt(0);
        if(ch=='a')
        {
            System.out.println("The Character "+ch + " is Vowel");
        }
       else if(ch=='i')
        {
            System.out.println("The Character "+ch + " is Vowel");
        }
        else if(ch=='e')
        {
            System.out.println("The Character "+ch + " is Vowel");
        }
       else if(ch=='o')
        {
            System.out.println("The Character "+ch + " is Vowel");
        }
       else if(ch=='u')
        {
            System.out.println("The Character "+ch + " is Vowel");
        }
       else {
            System.out.println("The Character "+ch + " is Consonant");
            }


    }
}
