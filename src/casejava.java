import java.util.Scanner;
public class casejava {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number:");
        Scanner input=new Scanner(System.in);
        num=input.nextInt();

        switch (num%2){

            case 1:
                   System.out.println("Number is odd");
                   break;
            case 0:
                System.out.println("Number is even");
                break;

            default:
                System.out.println("invalid");
                break;
        }


    }
}
