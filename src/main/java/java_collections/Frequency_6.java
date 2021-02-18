//ques 6: Print the elements of an array in the decreasing frequency if 2 numbers
// have same frequency then print the one which came first.
//i have used the concept of streams
package java_collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency_6
{
    private static void sortArrayElementsByFrequency(int[] inputArray)
    {
        Map<Integer, Integer> elementCountMap = new LinkedHashMap<>();

        for (int i = 0; i < inputArray.length; i++)
        {
            if (elementCountMap.containsKey(inputArray[i]))
            {
                //If element is present in elementCountMap, increment its value by 1

                elementCountMap.put(inputArray[i], elementCountMap.get(inputArray[i])+1);
            }
            else
            {
                //If element is not present, insert this element with 1 as its value

                elementCountMap.put(inputArray[i], 1);
            }
        }
        ArrayList<Integer> sortedElements = new ArrayList<>();

        elementCountMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(entry -> {
            for(int i = 1; i <= entry.getValue(); i++)
                sortedElements.add(entry.getKey());
        });

        //Printing sorted array elements in descending order of their frequency

        System.out.println("Input Array :"+Arrays.toString(inputArray));

        System.out.println("Sorted Array Elements In Descending Order Of their Frequency :");

        System.out.println(sortedElements);
    }

    public static void main(String[] args)
    {
        sortArrayElementsByFrequency(new int[] {7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3});
    }
}