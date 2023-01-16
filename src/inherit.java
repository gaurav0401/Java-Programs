class base {

      int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class derived  extends base {
      int y;

    public void setY(int y) {
        this.y = y;
    }
    void display (){
        int res=x+y;
        System.out.println("Sum of two members is:"+res);
    }


}

public class inherit {
    public static void main(String[] args) {
            derived d1=new derived();
            d1.setX(11);
            d1.setY(20);
            d1.display();
    }
}
