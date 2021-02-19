//Write the following a functional interface and implement it using lambda:
//(1) First number is greater than second number or not : Parameter (int ,int ) Return boolean
//(2) Increment the number by 1 and return incremented value : Parameter (int) Return int
//(3) Concatenation of 2 strings :  Parameter (String , String ) Return (String)
//(4) Convert a string to uppercase and return : Parameter (String) Return (String)
package java8_features;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;


public class Functional_Interface_1 {


    public static void main(String[] args) {

        //1
        BiPredicate<Integer, Integer>CheckLarge = (n1, n2) -> n1>n2 ;
        System.out.println(CheckLarge.test(10, 20));

        //2
        Function<Integer, Integer> IncrementFunction = x -> x + 1;
        System.out.println(IncrementFunction.apply(1));

        //3
        BiFunction<String, String, String>ConcatString = (str1, str2) -> str1+str2  ;
        System.out.println(ConcatString.apply("Pavleen","Kaur"));

        //4
        Function<String, String>UpperString = str -> str.toUpperCase();
        System.out.println(UpperString.apply("pavleen"));


    }
}