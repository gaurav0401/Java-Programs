
class shapes {
     private  int rad;
     private int  height;

    public shapes(int rad, int height) {
        this.rad = rad;
        this.height = height;
    }

    void setRad(int r){
        rad=r;
     }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getRad() {
        return rad;
    }

   float area (){
        float res=3.14f *rad*rad*height;
        return  res;

    }



}
public class Cylinder {

    public static void main(String[] args) {

        shapes c1=new shapes(2,5);
        float area=c1.area();
        System.out.println("Area is:"+area);

    }
}
