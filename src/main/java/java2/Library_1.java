package java2;//Create Java classes having suitable attributes for java2.Library management system.
// Use OOPs concepts in your design.Also try to use interfaces and abstract classes
/* DESIGN:
The following features should be there:
Database: This has two functions – Insertion of data and extraction of data with a user-friendly screen.
Reports: For the borrowed books list to display.
Available: To view the availability of books.
Search: search facility for books and members.
Payment: Payment facility for fine payments.
*
*USERS:
1) ADMIN 2)LIBRARIAN
USER FUNCTIONS
Admin: Add, view, and delete the librarian.
Librarian: Add, view, issue books, return books, payment.
* */


//A VERY BASIC IMPLEMENTATION DEPICTING THE BOOKS IN THE LIBRARY
//AND FOR ADDING STUDENT DATA.
import java.util.Scanner;
public class Library_1 {

    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int choice=0;

        while(choice !=3){
            System.out.println("Press 1 for detail or 2 for library to continue: ");
            choice=obj.nextInt();
            if(choice == 1){
                Library obj1= new Library();
                System.out.println("Enter Student name: ");
                obj1.name=obj.nextLine();
                obj1.name=obj.nextLine();
                System.out.println("Enter Father's name: ");
                obj1.fname=obj.nextLine();
                System.out.println("Enter University id: ");
                obj1.uni_id =obj.nextLine();
                System.out.println("Enter user id name: ");
                obj1.uid=obj.nextLine();
                System.out.println("Enter Semester: ");
                obj1.sem=obj.nextInt();


                obj1.getdata(obj1.name, obj1.fname, obj1.uni_id, obj1.uid, obj1.sem);
                obj1.setdata();
            }
            else if(choice ==2){

                Module2 obj2= new Module2();

                obj2.chemistry();
                obj2.biology();
                obj2.novel();
            }
        }

    }
}
class Module2 {
    public void chemistry() {
        String[] chem = {"Organic chemistry", "physical chemistry", "biology chemistry"};
        System.out.println("The available books in chemistry department: ");

        for (int i = 0; i < chem.length; i++) {
            System.out.println(chem[i]);
        }
    }
    public void biology() {
        String[] bio = {"Plant history", "Bones", "chapter of human", "Dental"};
        System.out.println("The available books in Biology department: ");
        for (int j = 0; j < bio.length; j++) {
            System.out.println(bio[j]);
        }
    }
    public void novel() {
        String[] nov = {"Notebook", "2 States", "Fault"};
        System.out.println("The available books in Novel: ");
        for (int k = 0; k < nov.length; k++) {
            System.out.println(nov[k]);
        }
    }
}
 class Library {
    String name,fname,uni_id,uid;
    int sem;
    public void getdata(String name, String fname, String uni_id,String uid, int sem){
        this.name=name;
        this.fname=fname;
        this.uni_id=uni_id;
        this.uid=uid;
        this.sem=sem;


    }
    public void setdata(){
        System.out.println("Student's name: " +name);
        System.out.println("Student's father name: " +fname);
        System.out.println("University id: " +uni_id);
        System.out.println("user id: " +uid);
        System.out.println("Student's Semester: " +sem);
    }
}

