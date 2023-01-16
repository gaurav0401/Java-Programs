import java.util.Scanner;

public class sumnat {
    static  int calc_sum(int n){
        int res=0;
        if (n==1){
            return  n;
        }
        else {
            return n+calc_sum(n-1);
        }
    }
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int num=inp.nextInt();
        System.out.printf("Sum of first %d natural number is: %d" , num , calc_sum(num) );
    }
}
