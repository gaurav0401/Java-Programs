import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        int a;
        Scanner inp=new Scanner(System.in);
        boolean test=inp.hasNextInt();
        a=inp.nextInt();
        System.out.println(a);
        System.out.println(test);
        String name=inp.next();
        System.out.println("My name is :"+name);


    }
}
