//Ques 4:Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name

package java_collections;
import java.util.*;
import java.lang.*;

public class Employee_4 {
     double age;
     double salary;
     private String Name;

    public Employee_4(double age, double salary, String Name){
        this.age = age;
        this.salary = salary;
        this.Name = Name;
    }
    public String toString()
    {
        return this.age + " " + this.salary + " " + this.Name;
    }

    static class SalaryComparator implements Comparator<Employee_4>
    {
        // Used for sorting in ascending order of
        // name
        public int compare(Employee_4 a, Employee_4 b)
        {
            return Double.compare(b.salary, a.salary);
        }
    }

    public static void main(String[] args) {
    ArrayList<Employee_4> ar = new ArrayList<>();
    ar.add(new Employee_4(21, 10000, "manvir"));
    ar.add(new Employee_4(31, 50000, "pavleen"));
    ar.add(new Employee_4(25, 25000, "prateek"));
    ar.add(new Employee_4(28, 17000, "riya"));
        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new SalaryComparator());

        System.out.println("\nSorted by salary");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));


    }

}
