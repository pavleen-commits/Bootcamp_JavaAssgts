//ques 11: Find average of the number inside integer list after doubling it.
package java8_features;
import java.util.List;


public class Average_11 {

    public static void main(String[] args){
        List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        System.out.println(nums.stream()
                  .mapToDouble(a -> a*2).average()
                  .orElseThrow(IllegalStateException::new));
        }
}



