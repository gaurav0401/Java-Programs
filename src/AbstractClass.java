abstract class Parent {

      String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String  message) {
        this.message = message;
    }
    abstract void greet();
}

class Child extends  Parent{
    void greet(){
        System.out.println("Hello dear,\n"+ message);
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        Parent p1=new Child();
        String str="You're invited for today party at 7pm.";
        p1.setMessage(str);
        p1.greet();

    }
}
