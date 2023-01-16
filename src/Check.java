import java.util.Scanner;

public class Check {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        int num;
//        num=input.nextInt();
        boolean test=input.hasNextInt();
        if (test==true){
            System.out.println("Enter number is integer.");
        }
        else {
            System.out.println("Enter number is not a integer.");
        }

    }
}
