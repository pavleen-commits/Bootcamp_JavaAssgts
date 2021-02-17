package java2;

import java.util.Scanner;

//Ques2:  WAP to sorting string without using string Methods?.
public class Sort_2 {
    static void StringSort(String str) {
        int j;
        char temp;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (j = 0; j < chars.length; j++) {
                if (chars[j] > chars[i]) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        for (int k = 0; k < chars.length; k++) {
            System.out.println("Sorted String is");
            System.out.print(chars[k]);
        }
    }
public static void main(String[] args){
        String str;
        System.out.println("ENTER STRING");
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        StringSort(str);
    }
}
