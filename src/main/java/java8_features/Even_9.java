//ques 9: Collect all the even numbers from an integer list.
package java8_features;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Even_9 {
    public static void main(String [] args) {
        List<Integer> numbers = Arrays.asList(0, 1, -7, 9, 0, 3, 5, 1, 2, 6);
        numbers.stream().filter(number -> number%2 == 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        }
    }
