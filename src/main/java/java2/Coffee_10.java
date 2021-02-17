package java2;//Ques 10: Design classes having attributes and method(only skeleton) for a coffee shop. There are
// three different actors and their different actions in our scenario.

//SKELETON:
//Actor 1: Customer:
/* Methods: 1) Make Payment(booking confirm, when he receives token)
            2) Order Ready function

*  Attributes: token, coffee received(boolean field)
* Actor 2: Cashier:
* Methods: 1) Receive Payment
*          2) Grant Token
           3) Forwards order to Order queue

* Attributes: token, total price, quantity, wait_message(boolean field), bill
Actor 3: Barista:
Methods: 1) Collects order from Order Queue
         2) Prepares coffee and puts the order in Complete Queue
         3) Informs the Customer
Attributes: token, ready flag(to distinguish whether order is ready or not)*/
// VERY BASIC IMPLEMENTATION
import java.util.*;
public class Coffee_10 {
    public static void main(String[] args) {
        int qty;
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like to place an order? press 1 for yes or 2 for no :");
        input = sc.nextInt();
        if (input == 1) {
            System.out.println("Enter the quantity for Coffee");
            qty = sc.nextInt();
            Cashier(qty); }
        else{
            System.out.println("Thank you for Visiting");
        }
    }

    static void Cashier(int qty) {
        int total, token=0, price=50;
        total = price * qty;
        System.out.println("Amount to be paid is: "+total +"Rs");
        token = token +1;
        System.out.println("Your token no is: " +token);
        System.out.println("Please wait for sometime!");
        Barista(token);

    }
    static  void Barista(int token){
        System.out.println("Coffee for token no: "+token +"  is ready");
        Customer(token);
    }
    static void Customer(int token){
        System.out.println("My token no is: "+token);
        System.out.println("Thank you for the Coffee!");
    }
}

