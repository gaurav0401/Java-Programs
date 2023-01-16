import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int [][]matrix1=new int [3][2];
        int [][]matrix2=new int [3][2];
        int [][]matrix3=new int [3][2];

        System.out.println("Enter elements in matrix 1:");
        for (int i=0 ; i<3 ; i++){
            for (int j = 0; j < 2; j++) {
                int num=input.nextInt();
                matrix1[i][j]=num;
            }


        }


        System.out.println("Enter elements in matrix 2:");
        for (int i=0 ; i<3 ; i++){
            for (int j = 0; j < 2; j++) {
                int num=input.nextInt();
                matrix2[i][j]=num;
            }


        }

        System.out.println("Adding matrix 1 and matarix 2....");
        for (int i=0 ; i<3 ; i++){
            for (int j = 0; j < 2; j++) {

                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];

            }


        }

        System.out.println("Resultant matrix is:");
       for(int [] elements :matrix3){
           System.out.println(elements);
       }
    }
}
