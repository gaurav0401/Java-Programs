
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

       int [] marks=new int [5];
       Scanner input=new Scanner(System.in);
       int  max=marks[0];
       int  num;
       for (int i=0 ; i<5 ; i++){

           num=input.nextInt();
           marks[i]=num;

       }

        for (int i = 0; i < marks.length/2 ; i++) {

            int temp=marks[i];
            marks[i]=marks[marks.length-i-1];
            marks[marks.length-i-1]=temp;

        }

        for (int item : marks){
            System.out.println(item);
        }



    }
}
