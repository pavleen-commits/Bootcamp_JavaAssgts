//ques 5: Write a program to sort the Student objects based on Score ,
// if the score are same then sort on First Name .
// Class Student{ String Name; Double Score; Double Age}
package java_collections;
import java.util.*;
import java.lang.*;

public class Student_5 {

    private String Name;
    private double age;
    private double score;


    public Student_5(String Name, double age, double score) {
        this.Name = Name;
        this.age = age;
        this.score = score;

    }

    public String toString() {
        return this.Name + " " + this.age + " " + this.score;
    }

    static class ScoreComparator implements Comparator<Student_5> {
        public int compare(Student_5 a, Student_5 b) {
            if (a.score == b.score) {
                return a.Name.compareTo(b.Name);
            }
            return Double.compare(a.score, b.score);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student_5> ar = new ArrayList<>();
        ar.add(new Student_5("riya", 19, 89));
        ar.add(new Student_5("pavleen", 18, 96));
        ar.add(new Student_5("prateek", 18, 78));
        ar.add(new Student_5("manvir", 19, 89));

        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new ScoreComparator());

        System.out.println("\nSorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));


    }
}