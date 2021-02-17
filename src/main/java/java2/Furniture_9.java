package java2;//ques 9: Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables.
// There are stress and fire tests for each products.
import java.util.Scanner;
interface Furniture {
     void stressTest();
     void fireTest();
}

abstract class Chair implements Furniture {
    public abstract void chairType();

}
abstract class Table implements Furniture {
    public abstract void tableType();
}

class MetalChair extends Chair {
    @Override
    public void stressTest() {
        System.out.println("Metal chair passed the stress test");
    }

    @Override
    public void fireTest() {
        System.out.println("Metal chair passed the fire test");

    }

    @Override
    public void chairType() {
        System.out.println("This is metal chair");
    }
}

class MetalTable extends Table {
    @Override
    public void stressTest() {

        System.out.println("Metal table passed the stress test");

    }

    @Override
    public void fireTest() {

        System.out.println("Metal table passed the fire test");
    }

    @Override
    public void tableType() {

        System.out.println("This is metal table");
    }
}


class WoodenTable extends Table {
    @Override
    public void stressTest() {

        System.out.println("wooden table failed stress test");
    }

    @Override
    public void fireTest() {

        System.out.println("Wooden table failed fire test");
    }

    @Override
    public void tableType() {
        System.out.println("This is a wooden java2.Table");

    }
}


class WoodenChair extends Chair {
    @Override
    public void stressTest() {
        System.out.println("Wooden chair failed stress test");
    }

    @Override
    public void fireTest() {
        System.out.println("Wooden chair failed fire test");
    }

    @Override
    public void chairType() {
        System.out.println("This is wooden chair");
    }
}

public class Furniture_9 {
    public static void main(String[] args){
        Table table ;
        Chair chair;
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter furniture name :");
        String str = input.next();
        if(str.equals("woodentable")){
            table = new WoodenTable();
            table.tableType();
            table.stressTest();
            table.fireTest();


        }   else if (str.equals("metaltable")){
            table = new MetalTable();
            table.tableType();
            table.stressTest();
            table.fireTest();


        }
        else if (str.equals("metalchair")) {
            chair = new MetalChair();
            chair.chairType();
            chair.stressTest();
            chair.fireTest();
        }
        else if (str.equals("woodenchair")) {
            chair = new WoodenChair();
            chair.chairType();
            chair.stressTest();
            chair.fireTest();
        }






    }
}