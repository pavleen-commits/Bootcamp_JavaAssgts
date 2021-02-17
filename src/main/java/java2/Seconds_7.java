package java2;//Ques 7. WAP to convert seconds into days, hours, minutes and seconds.
import java.util.Scanner;
public class Seconds_7 {
    static void ConvertSeconds(int n)
    {
        int day = n / (24 * 3600);

        n = n % (24 * 3600);
        int hour = n / 3600;

        n %= 3600;
        int minutes = n / 60 ;

        n %= 60;
        int seconds = n;

        System.out.println( day + " " + "days " + hour + " " + "hours " + minutes + " " + "minutes " + seconds + " "
                + "seconds ");
    }
    public static void main (String[] args)
    {
        int seconds;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in Seconds");
        seconds = sc.nextInt();
        ConvertSeconds(seconds);
    }
}