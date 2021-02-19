//ques 6 Create and access default and static method of an interface.
package java8_features;
interface Demo{

        static void displayStatic(){
            System.out.println("This is demo Static method");
        }

        default void display(){
            System.out.println("This is demo default method");
        }
    }

    class DemoImpl implements Demo{

    }

    public class Default_Static_6 {

        public static void main(String[] args) {
            Demo.displayStatic();
            DemoImpl demo = new DemoImpl();
            demo.display();
        }



    }

