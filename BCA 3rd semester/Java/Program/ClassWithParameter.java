////create a class student having id,name, and fee as a parameter and create two contructor
////one for defult and another for parameter and value. create two object one method to display
////info.
//
class Student {
   int id;
   String name;
   double fee;


   Student() {
       id = 0;
       name = "No Name";
       fee = 0.0;
   }


   Student(int id, String name, double fee) {
       this.id = id;
       this.name = name;
       this.fee = fee;
   }


   void display() {
       System.out.println("ID: " + id);
       System.out.println("Name: " + name);
       System.out.println("Fee: " + fee);
       System.out.println("--------------------------");
   }
}

public class ClassWithParameter {
   public static void main(String[] args) {

       Student s1 = new Student();


       Student s2 = new Student(13, "bibhu", 25004);


       s1.display();
       s2.display();
   }
}
