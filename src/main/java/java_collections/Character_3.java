//Ques 3: Write a method that takes a string and print
//the number of occurrence of each character characters in the string.
package java_collections;
import java.util.*;
    class Character_3 {
        static void characterCount(String inputString)
        {
            HashMap<Character, Integer> charCountMap = new HashMap<>();
            // Converting given string to char array
            char[] strArray = inputString.toCharArray();
            // checking each char of strArray
            for (char c : strArray) {
                if (charCountMap.containsKey(c)) {
                    // If char is present in charCountMap,
                    // incrementing it's count by 1
                    charCountMap.put(c, charCountMap.get(c) + 1);
                }
                else {
                    // If char is not present in charCountMap,
                    // putting this char to charCountMap with 1 as it's value
                    charCountMap.put(c, 1);
                }
            }

            // Printing the charCountMap
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        // Driver Code
        public static void main(String[] args)
        {   Scanner sc = new Scanner(System.in);
            System.out.println("enter the string");
            String str;
            str = sc.next();
            characterCount(str);
        }
    }


