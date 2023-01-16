import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int day;
        day=input.nextInt();
        switch (day){
            case 1-> System.out.println("Sunday");
            case 2-> System.out.println("Monday");
            case 3-> System.out.println("Tuesday");
            case 4-> System.out.println("Wednesday");
            case 5-> System.out.println("Thurday");
            case 6-> System.out.println("Friday");
            case 7-> System.out.println("Saturday");
            default -> System.out.println("Invalid day");


        }
    }
}
