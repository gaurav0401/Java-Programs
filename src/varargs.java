import java.util.Scanner;

public class varargs {
    static  int find_sum(int ...list){
        int res=0;
        for (int numbers: list){
            res+=numbers;
        }
        return  res;
    }
    public static void main(String[] args) {


        System.out.println("Sum of given arguements:"+ find_sum(1,2,3,4,5,6,7,8,9,10));

    }
}
