//ques 8:  Implement multiple inheritance with default method inside  interface.
package java8_features;
interface Poet {
    default void write() {
        System.out.println("Poet's default method");
    }
}


interface Writer {
    default void write() {
        System.out.println("Writer's default method");
    }
}
public class MultipleInheritance_8 implements Poet, Writer {

    @Override
    public void write() {
        System.out.println("Writing stories now days");
    }


    public static void main(String[] args) {
        MultipleInheritance_8 m = new MultipleInheritance_8();
        m.write();
    }
}


