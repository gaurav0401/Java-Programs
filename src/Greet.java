import java.util.Scanner;
public class Greet {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name;
        name=input.nextLine();
        System.out.println("Good Evening, "+name+" have a good day.");
    }
}
