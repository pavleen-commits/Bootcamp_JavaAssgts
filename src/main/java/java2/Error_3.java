package java2;//Ques 3: ClassNotFoundException and NoClassDefFoundError both occur when class is not found at runtime
//ClassNotFoundException and NoClassDefFoundError both occur when class is not found at runtime

//Creating this class and will delete it, after executing once, to generate NoClassDefFoundError due
//to Linkage error.
class NoClassError
{
    void welcome()
    {
        System.out.println("hello world!");
    }
}
public class Error_3 {
    static void error1() {
        //ClassNotFoundException occurs when you try to load a class at runtime using Class.forName()
        //or loadClass() methods and requested classes are not found in classpath.
        try {
            Class.forName("Hello");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
        public static void main (String []args){
        error1();
        //Before deleting the class, hello world! will be generated as output.
            // after deleting the class, error occurs.
        NoClassError n = new NoClassError();
        n.welcome();


        }
    }