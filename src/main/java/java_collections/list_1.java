package java_collections;
//Ques 1: Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator,
// find the sum of the numbers in List.
import java.util.*;

public class list_1 {
   static void list_java() {
       float sum1 = 0;
       ArrayList<Float> list = new ArrayList<>(5);
       list.add(2.3f);
       list.add(3.f);
       list.add(7.6f);
       list.add(3.3f);
       list.add(6.7f);
       Iterator<Float> theIterator = list.iterator();
       while (theIterator.hasNext()) {
           sum1 = sum1 + theIterator.next();
       }
       System.out.println("SUM OF NUMBERS USING ITERATOR IS " +sum1);
   }
    public static void main(String[] args){
            list_java();

        }
    }

