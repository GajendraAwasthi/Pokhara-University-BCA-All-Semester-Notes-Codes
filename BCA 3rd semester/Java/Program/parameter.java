//create a class student having id,name, and fee as a parameter and create two contructor
//one for defult and another for parameter and value. create two object one method to display
//info.
class Student {
    int id;
    String name;
    double fee;

    Student(){
        id = 13;
        name = "bibhu";
        fee = 125.2;

    }

    Student(int id, String name, double fee){
        this.id = id;
        this.name = name;
        this.fee = fee;

    }
    void display(){
        System.out.println("ID: " + id);
        System.out.println(("Name: " + name));
        System.out.println("fee: " + fee);
    }


}

public class parameter {
    public static void main(String... args){
        Student s1 = new Student();
        Student s2 = new Student(103, "bibhu", 152.02);
        s1.display();
        s2.display();


    }

}
