import org.w3c.dom.ls.LSOutput;

public class StudentArray {
    public static void main(String... args) {
        String[] names = {"Asmita","Rejina","Bibhu","Gajendra",};
        double[] gpa = {2.5, 3.2, 2.0, 3.9};
        System.out.println("Students names:");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(" students gpa:");
        for(double grade: gpa){
            System.out.println(grade);
        }
    }


}
