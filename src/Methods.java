public class Methods {
    int sum (int a , int b){
        return a+b;
    }

    static  void change ( int [] a){
        a[3]=56;
    }
    public static void main(String[] args) {
        int a,b;
        a=78;
        b=12;

        int []  arr = {1,2,3,4,5};
        change(arr);
        System.out.println(arr[3]);

//        Methods m1=new Methods();
//        int res=m1.sum(a,b);
//        System.out.println("Sum is:"+res);

    }
}
