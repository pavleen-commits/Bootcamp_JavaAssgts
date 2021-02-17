package java2;//Ques12.What will be the  output on new java2.Child(); ?

//Block Execution order will be:
//Static -> Instance -> Constructor
//The static initializer for a class gets run when the class is first accessed
// either to create an instance, or to access a static method or field.
class Parent extends Grandparent {

    {
        System.out.println("instance - parent");
    }

    public Parent() {
        System.out.println("constructor - parent");
    }

    static {
        System.out.println("static - parent");
    }
}

class Grandparent {

    static {
        System.out.println("static - grandparent");
    }

    {
        System.out.println("instance - grandparent");
    }

    public Grandparent() {
        System.out.println("constructor - grandparent");
    }
}

class Child extends Parent {

    public Child() {
        System.out.println("constructor - child");
    }

    static {
        System.out.println("static - child");
    }

    {
        System.out.println("instance - child");
    }
}
public class Output_12 {
    public static void main(String[] args){
    new Child();

    }
}
