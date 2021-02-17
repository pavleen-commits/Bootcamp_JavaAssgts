package java2;//Ques 8: WAP to read words from the keyboard until the word done is entered.
// For each word except done, report whether its first character is equal
// to  its last character. For the required loop, use a
//A) While loop
import java.util.*;
import java.lang.String;
public class Keyboard_8 {
    static void enter_while() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your string: ");
        String input = sc.next();
        int n;
        while (!input.contentEquals("done")) {
            n =input.length();
            if (n < 2)
                System.out.println("Single Character");
            if (input.charAt(0) == input.charAt(n-1))
                System.out.println("First & last character is same");
            else
                System.out.println("First & last character is different");
            input = sc.next();
        }
    }
    //B)Do While loop
    static void enter_do_while(){
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Insert your String");
            String userInputText;
            do{
                userInputText =  sc.next();
                n =userInputText.length();
                if (n < 2)
                    System.out.println("Single Character");
                if (userInputText.charAt(0) == userInputText.charAt(n-1))
                    System.out.println("First & last character is same");
                else
                    System.out.println("First & last character is different");
            }while (!userInputText.contentEquals("done"));
        }

    public static void main(String[] args){
        int method;
        System.out.println("Choose your Method: 1 or 2");
        Scanner sc = new Scanner(System.in);
        method = sc.nextInt();
        switch (method){
            case 1: enter_while();
                    break;
            case 2: enter_do_while();
                    break;
            default:
                System.out.println("Enter a valid option");

        }


    }
}
