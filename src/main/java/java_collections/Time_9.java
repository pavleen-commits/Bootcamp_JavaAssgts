//ques 9: Write a program to display times in different country format
package java_collections;
import java.text.DateFormat;
import java.util.*;
public class Time_9 {
    static  void TimeCountry (){
        Date d1 = new Date();
        System.out.println("today is "+ d1.toString());
        Locale locItalian = new Locale("it","ch");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItalian);
        Locale LOCALE_HUNGARIAN = new Locale("hu", "HU");
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, LOCALE_HUNGARIAN);
        System.out.println("today in Italian Language in Switzerland Format : "+ df.format(d1));
        System.out.println("today in Hungary Language in Hungarian Format : "+ df2.format(d1));
    }
    public static void main(String[] args) throws Exception {
        TimeCountry();
    }
}
