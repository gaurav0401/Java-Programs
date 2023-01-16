
import java.util.Scanner;
public class CBSE {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int m1,m2,m3,m4,m5 ,m6,m7,total=0,percent=0;
        float cpga;
        System.out.println("Enter marks of 7 subjects:");
        m1=input.nextInt();
        m2=input.nextInt();
        m3=input.nextInt();
        m4=input.nextInt();
        m5=input.nextInt();
        m6=input.nextInt();
        m7=input.nextInt();

        total=m1+m2+m3+m4+m5+m6+m7;
        percent=(total*100)/700;
        cpga=percent/9.5f;
        System.out.println("Percentage of a student is:"+percent+"%");
        System.out.print("CGPA of a student is:");
        System.out.printf("%.2f",cpga);


    }
}
