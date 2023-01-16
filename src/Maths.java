
class rectangle{
    private int l,b;
    int res;

    public  rectangle (int a,int b) {
           l=a;
           this.b=b;
    }
    public  rectangle (int a) {
        l=a;
        b=12;
    }
    void set_val(int l , int b){
        this.l=l;
        this.b=b;
    }
    void get_area(){
        res=l*b;
        System.out.println("Area is:"+res);
    }
    void get_peri(){
        res=2*(l+b);
        System.out.println("Perimeter :"+res);
    }

}
public class Maths {
    public static void main(String[] args) {
        rectangle r1=new rectangle(10 );
//       r1.set_val(12,12);

        r1.get_area();
        r1.get_peri();

    }
}
