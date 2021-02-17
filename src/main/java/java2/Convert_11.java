package java2;

//Ques 11: Convert the given  code so that it uses nested while statements instead of for statements
public class Convert_11 {
    static void Convert(int s, int t) {
        int i =0;
        while(i<10){
            s = s+i;
            int j = i;
            while(j>0){
                t = t * (j - i);
                j--;
            }
            i++;
            s = s * t;

            System.out.println("T is " + t);
        }
        System.out.println("S is " + s);
    }
    public static void main(String[] args){
        int s=0;
        int t =1;
        Convert(s,t);
    }
}
