public class student {
    String name;
    int id;
    double fee;

    student(){
        name="lok gc";
        id=1795164055;
        fee=570000000;
    }
    student(String name,int id,double fee){
        this.name = name;
        this.id=id;
        this.fee=fee;
    }
    void display(){
    System.out.println("name "+ name);
            System.out.println("id:" + id);
            System.out.println("fee: "+ fee);
    }
    public static void main(String[] args){
        student stu = new student();
        stu.display();
        student stu1 = new student();
        stu1.display();
    }
}
