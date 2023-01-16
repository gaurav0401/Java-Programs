import java.util.Scanner;

public class pattern2 {
//    static void draw_pattern(int n){
//
//        for (int i = n; i >0 ; i--) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.printf("*");
//            }
//            System.out.printf("\n");
//        }
//
//    }
    static  void draw_pattern(int n){

       if (n>0){
           draw_pattern(n-1);
           for (int i = 0; i < n ; i++) {
               System.out.printf("*");
           }
           System.out.println();


       }


    }

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int num=inp.nextInt();
        draw_pattern(num);
    }
}
