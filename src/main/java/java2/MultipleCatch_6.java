package java2;//Ques 6: WAP showing try, multi-catch and finally blocks.
import java.util.*;
public class MultipleCatch_6 {
    static void exceptionMethod(){
        int quotient;
        try{
            int  divisor;
            int dividend ;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the dividend : ");
            dividend = sc.nextInt();
            System.out.print("Enter the divisor : ");
            divisor = sc.nextInt();
            System.out.println("Dividend  : " +dividend);
            System.out.println("Divisor : " +divisor);
            quotient = dividend / divisor;
            System.out.println("Quotient = " + quotient);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){

            System.out.println("InputMismatchException, enter integer value");

        }
        finally{
            System.out.println("Execution Finished");
        }
    }
    public static void main(String[] args) {
        exceptionMethod();
    }
}