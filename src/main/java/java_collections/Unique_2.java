//Ques 2: Write a method that takes a string and returns the number of unique characters
// in the string.
package java_collections;
import java.util.Scanner;

public class Unique_2 {
    static final int NO_OF_CHARS = 256;
    void uniqueCharacters(String str)
    {
        int[] count = new int[NO_OF_CHARS];

        int i;
        for (i = 0; i < str.length(); i++)
            if(str.charAt(i)!=' ')
                count[(int)str.charAt(i)]++;
        int n = i;
        for (i = 0; i < n; i++)
            //printing characters that occurred only once i.e. unique.
            if (count[(int)str.charAt(i)] == 1)
                System.out.print(str.charAt(i));
    }


    public static void main(String[] args)
    {
        Unique_2 obj = new Unique_2();
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        obj.uniqueCharacters(input);

    }
}
