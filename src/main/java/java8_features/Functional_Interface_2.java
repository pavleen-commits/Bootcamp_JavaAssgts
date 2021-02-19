//ques 2: Create a functional interface whose method takes 2 integers and return one integer.
package java8_features;

import java.util.function.BiFunction;

public class Functional_Interface_2 {
    public static void main(String[] args)
    {

        BiFunction<Integer, Integer, Integer> Addition = (x, y) -> x + y;
        System.out.println(Addition.apply(10,5));

    }
}
