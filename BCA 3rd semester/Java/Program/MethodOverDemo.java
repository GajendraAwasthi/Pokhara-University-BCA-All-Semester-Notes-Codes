public class MethodOverDemo {
    public void  greeding(){
        System.out.println("Welcome to NAST");
    }

    public String greeding(String name) {
        return"Welcome"+name+"to BCA";

    }
    public double greeding(String name,String program){
        System.out.println("Welcome"+name+"to"+program);
        System.out.print("\tyour GPA:");
        return 3.7;


    }
    static void main(String[]args){
        MethodOverDemo d=new MethodOverDemo();
        d.greeding();
        System.out.println(d.greeding("umakant"));
        System.out.println(d.greeding("umakant","BCA"));

    }

    }


