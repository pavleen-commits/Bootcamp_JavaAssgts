package java2;

//Ques 4: WAP to create singleton class.
// a singleton class is a class that can have only one object (an instance of the class) at a time
// Difference in normal and singleton class in terms of instantiation is that, For normal class we use
// constructor, whereas for singleton class we use getInstance() method
public class Singleton_4 {
    private static Singleton_4 single_instance = null;
    public String s;
    private Singleton_4()
    {
        s = "Hello I am a string part of Singleton class";
    }

    // static method to create instance of Singleton class
    public static Singleton_4 getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton_4();

        return single_instance;
    }
    public static void main(String [] args)
    {
        Singleton_4 x = Singleton_4.getInstance();
        Singleton_4 z = Singleton_4.getInstance();

        // changing variable of instance x
        x.s = (x.s).toUpperCase();
        // single instance at a point, changing it for x, but it changes for z as well.
        System.out.println("String from x is " + x.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        // changing variable of instance z
        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from z is " + z.s);
    }
}


