//ques 8: Write a program to format date as example "21-March-2016"
package java_collections;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_8 {
    static void DateFormat(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
        String strDate= formatter.format(date);
        System.out.println(strDate);
    }
    public static void main(String[] args) {
        DateFormat();
    }
}