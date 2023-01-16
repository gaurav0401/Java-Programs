

class base1 {
    int x;
    base1(){
        System.out.println("Calling from base class");
    }
    base1 (int x){
        System.out.println("Value of x from base class:"+x);


    }

}

class derived1 extends  base1{

   public derived1(){
       super(132);
        System.out.println("Calling from derived class");
    }

    derived1 (int x){
        System.out.println("Value of x from derived class:"+x);


    }
    void message(){
       System.out.println("This message is from base class.");
    }

}

class newchild extends derived1{

    newchild(){
        super(20);
        System.out.println("Calling from child class");
    }
    @Override

    void message(){
        System.out.println("This message is from child class.");
    }

}


public class Const_inherit {
    public static void main(String[] args) {

//        derived1 d1=new derived1(12);
        newchild c1=new newchild();
        c1.message();

    }
}
