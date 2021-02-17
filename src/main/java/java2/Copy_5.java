package java2;

//Ques 5: WAP to show object cloning in java using cloneable and copy constructor both.
//Method 1: USING CLONEABLE
//Method 2: There is no copy constructor in Java.
// However, we can copy the values from one object to another like copy constructor in other languages.
public class Copy_5 implements Cloneable{
        int rollno;
        String name;

        Copy_5(int rollno,String name){
            this.rollno=rollno;
            this.name=name;
        }

        //Method 2: constructor to initialize another object
        Copy_5(Copy_5 s){
        rollno = s.rollno;
        name =s.name;
    }
    public Object clone()throws CloneNotSupportedException{
           return super.clone();
        }
    public static void main(String[] args){
            //Method2:
            System.out.println("Using copy constructor");
            Copy_5 s1 = new Copy_5(5, "Manvir");
            Copy_5 s2 = new Copy_5(s1);
            System.out.println(s1.rollno + " " + s1.name);
            System.out.println(s2.rollno + " " + s2.name);

            //Method1:
            System.out.println("Using cloning");
            try {
                Copy_5 c1 = new Copy_5(10, "Pavleen");
                Copy_5 c2 = (Copy_5) c1.clone();
                System.out.println(c1.rollno + " " + c1.name);
                System.out.println(c2.rollno + " " + c2.name);
            }catch(CloneNotSupportedException c){
                System.out.println("Exception Caught");
            }
    }
        }

