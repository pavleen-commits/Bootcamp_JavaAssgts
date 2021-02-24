//ques 3: Using (instance) Method reference create and apply add and
// subtract method and using (Static) Method reference
// create and apply multiplication method for the functional interface created.
package java8_features;


public class Instance_Static_3 {

         void add (Integer a, Integer b ){
           System.out.println(a+b);
        }

         void sub (Integer a, Integer b ){
             System.out.println(a-b);
        }

        static void multiply(Integer a, Integer b){
            System.out.println(a*b);
        }

        public static void main(String[] args) {
            //Instance method reference
            Instance_Static_3 add1 = new Instance_Static_3();
            Instance_Static_3 sub1 = new Instance_Static_3();
            add1.add(2,3);
            sub1.sub(5,6);
            //Static Method reference
            multiply(3, 3);

        }
    }

