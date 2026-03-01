class Student {
    int id;
    String name;
    double fee;
    Student(){
        id=14;
        name=" Asmita";
        fee=600000;
    }
    Student( int id, String name,double fee){
        this.id=id;
        this.name=name;
        this.fee=fee;
    }
    void display(){
        System.out.println(" ID : " +id);
        System.out.println(" Name : " +name);
        System.out.println(" fee : " +fee);
    }


}
public class Constructor{
    public static void main ( String...args){
        Student s1= new Student();
        Student s2= new Student( 14, "Asmita",60000);
        s1.display();
        s2.display();


    }
}

