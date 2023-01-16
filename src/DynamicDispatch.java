class Animal{

    void action(){
        System.out.println("Barking.....");
    }
}

class Dog extends Animal{

    void action(){
        System.out.println("Dog is barking");
    }

}
public class DynamicDispatch {
    public static void main(String[] args) {
//We can use  parent class reference to create child class object but we cant use child class reference to create parent class object.

//        Animal a1=new Animal();
//        Dog d1=new Dog();
//        a1.action();
//        d1.action();
         Animal a1=new Dog();
         a1.action();
    }
}
