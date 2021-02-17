package java2;//Ques 13: Create a custom exception that does not have any stack trace.

public class CustomException_13  extends Exception {
    public CustomException_13(String s)
    {
        super(s);
    }
    static void CatchingException() throws Throwable {
        try {
            // Throws user defined exception
            throw new CustomException_13("Hello");
        } catch (CustomException_13 ex) {
            System.out.println("Caught");
            //WITHOUT STACK TRACE
            System.out.println(ex.getMessage());
            throw ex;

        }
    }
    public static void main(String[] args) throws Throwable {
        try {
            CatchingException();
        } catch (Exception e) {
            //WITH STACK TRACE
            System.err.println("Caught Inside Main:");
            e.printStackTrace();


        }

    }
}