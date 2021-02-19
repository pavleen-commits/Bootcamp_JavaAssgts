//ques 10: Sum all the numbers greater than 5 in the integer list.
package java8_features;

import java.util.Arrays;
import java.util.List;

public class Sum_10 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(0, 1, -7, 9, 0, 3, 5, 1, 2, 6);
        System.out.println(numbers.stream().filter(number -> number > 5)
                .reduce(0, Integer::sum));
    }
}
