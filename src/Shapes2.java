
interface operations{
    void area();
    void perimeter();
}

class Rect implements operations{
    int l,b;

    public Rect(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public void area(){
        System.out.println("area  is:"+(l*b));
    }
    public void perimeter(){
        System.out.println("Perimeter is:"+(2*(l+b)));
    }

}

class cuboid extends Rect{
    int h;
    public  cuboid(){

        super(0,0);
    }
    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void volume(){
        System.out.println("Volume is:"+(l*b*h));
    }

}
public class Shapes2 {
    public static void main(String[] args) {

        Rect r1=new Rect(11,13);
        r1.setB(3);
        r1.setL(5);
        r1.area();
        r1.perimeter();
        cuboid c1=new cuboid();
        c1.setH(11);
        c1.setB(12);
        c1.setL(13);
        c1.volume();

    }
}
