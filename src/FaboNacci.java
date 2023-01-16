import java.util.Scanner;

public class FaboNacci {
    static int  series(int n ){

        if (n==1 ){
            return 0 ;
        } else if (n==2) {
            return 1;

        } else {
            return series(n-1)+series(n-2);
        }
    }


    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("Enter term upto which you want fabonacci series:");
        int num=inp.nextInt();
        for (int i = 1; i <= num ; i++) {
            System.out.printf("term %d :-> %d\n ",i,series(i));
        }
    }
}
