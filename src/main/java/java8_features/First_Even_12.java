//ques 12: Find the first even number in the integer list which is greater than 3.
//This can be done using findFirst method.
package java8_features;

import java.util.List;


public class First_Even_12 {

    public static void main(String[] args) {


        List<Integer> numbers = List.of(0, 8, 1, -7, -3, 0, 3, 5, 1, 2,6);

        System.out.println(numbers.stream()
               .filter(number -> number%2 ==0 ).filter(  num -> num > 3 )
               .findFirst());


    }
}
