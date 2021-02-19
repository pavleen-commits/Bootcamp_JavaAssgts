//ques_7 Override the default method of the interface.
package java8_features;
interface Default1{

    default void display(){
        System.out.println("This is demo default method");
    }

}

class abc implements Default1{

    @Override
    public void display(){
        System.out.println("This is demo overridden method method");
    }
}

public class Default_7 {

    public static void main(String[] args) {
        abc demo = new abc();
        demo.display();
    }


}