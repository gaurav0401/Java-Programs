import java.util.Scanner;

public class sorted {

        public static void main(String[] args) {

            int [] array=new int [5];
            Scanner input=new Scanner(System.in);
            int  num;
            for (int i=0 ; i<5 ; i++){

                num=input.nextInt();
                array[i]=num;

            }
            int min=array[0];
            boolean isSorted=true;
            for (int i=0 ; i< 5 ; i++){

                if (array[i]<min){
                    isSorted=false;
                    break;
                }

            }


            if (isSorted==true){
                System.out.println("Array is Sorted");
            }
            else {
                System.out.println("Array is not Sorted");
            }



        }
    }

