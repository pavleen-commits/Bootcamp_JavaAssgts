//ques 4: Create an Employee Class with instance variables (String) name, (Integer)age, (String)city
// and get the instance of the Class using constructor reference
package java8_features;

@FunctionalInterface
interface EmployeeInterface{
    Employee createEmployee(String name, int  age, String city);
}

class Employee{
    String name;
    int age;
    String city;

    public Employee(String name, int age,  String city ) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", age='" + age + '\'' +
                ", city=" + city +
                '}';
    }
}

public class ConstructorReference_4 {

    public static void main(String[] args) {

        EmployeeInterface employeeInterface = Employee::new;
        Employee employee = employeeInterface.createEmployee("Pavleen ",21,"Roorkee");
        System.out.println(employee);



    }

}

