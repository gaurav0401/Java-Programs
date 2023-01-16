
class Employee {

   int salary;
   String name;

   void set_name(String name ){
       this.name=name;

   }
   String get_name(){
       return name;
   }
   int getSalary(){
       return salary;
   }

}
public class our_class {
    public static void main(String[] args) {
       Employee e1=new Employee();
       e1.salary=15000;
//       e1.set_name("Aditi" );
       int sal=e1.getSalary();
       String name=e1.get_name();
       System.out.printf("Name:%s\nSalary:%d",name,sal);

    }
}
