import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int num=in.nextInt();
//        int fact=1;
//
//        while (num>0){
//            fact*=num;
//            num--;
//        }
//        System.out.println("Factorial is:"+fact);
        int n=in.nextInt();
        int i=1;
        int sum=0;
        while (i<=10){

            System.out.printf("%d * %d = %d\n",n,i,n*i);
            sum+=n*i;
            i++;
        }
        System.out.println("Sum of numbers occuring in table is:"+sum);
    }
}
