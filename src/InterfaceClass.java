import jdk.jshell.SourceCodeAnalysis;

interface Smartphone {

     void memory();
    void display();
    void camera();



}

interface  Centers{

    void loc();
}

class Samsung implements Smartphone , Centers{
    int front=13,rear=108,wide=12;
    String display="Super Amoled";
    int dis_siz=6;
    int ram=8 , rom=128;

   public void display(){
        System.out.println("Display Size:"+dis_siz+"\nDisplay:"+display);
    }
   public void camera(){
        System.out.println("Rear:"+rear+"MP\nfront:"+front+"MP");
    }
   public void memory(){
        System.out.println("Ram:"+ram+"GB");
    }
    public void loc(){
       System.out.println("Raja Road , Clock Tower  , Rajpur Road , Chakrota");
    }
   public void show_det(){
       display();
       memory();
       camera();
       loc();
    }


}

public class InterfaceClass {

    public static void main(String[] args) {

       Samsung s1= new Samsung();
        s1.show_det();
    }

}
