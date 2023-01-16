import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int temp=a;
            for(int j=0;j<n;j++){
                int res=1,c=j;
                while (c!=0){
                    res=res*2;
                    c--;
                }
                int res2=temp+res*b;
                System.out.printf("%d ",res2);
                temp=res2;

            }
        }

    }
}
