//ques 5: Implement following functional interfaces from java.util.function using lambdas:
//(1) Consumer
//(2) Supplier
//(3) Predicate
//(4) Function
package java8_features;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functional_Interface_5 {
    public static void main(String[] args){
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        //1
        Consumer<Integer> sysoutConsumer = System.out::println;
        //3
        Predicate<Integer> isEvenPredicate = x -> x%2==0;
        //4
        Function<Integer, Integer> squareFunction = x -> x * x;
        numbers.stream()
                .filter(isEvenPredicate)
                .map(squareFunction)
                .forEach(sysoutConsumer);
        //2
        System.out.println("Generating a random no using supplier");
        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };
        System.out.println(randomIntegerSupplier.get());

    }

}
