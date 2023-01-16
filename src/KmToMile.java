import java.util.Scanner;

public class KmToMile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double distance,miles;
        System.out.println("Enter distance in (KM):");
        distance=input.nextFloat();
        miles=(distance/1.609);
        System.out.printf("KM->Miles=%.2f miles",miles);

    }
}
