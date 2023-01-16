import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        int m1,m2,m3,percent;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter marks of three subjects:");
        m1=input.nextInt();
        m2=input.nextInt();
        m3=input.nextInt();
        percent=((m1+m2+m3)*100)/300;
        if (m1>=33 && m2>=33 && m3>=33){
            if (percent>=40){
                System.out.println("Pass");
            }
            else {
                System.out.println("Fail");
            }

        }
        else {
            System.out.println("Fail");
        }


    }
}
