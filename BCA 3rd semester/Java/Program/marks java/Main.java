import nast.Student;
import nast.result.Test;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.show();
        Test t = new Test();
        System.out.println("Enter the mark:");
        int n = sc.nextInt();
        t.result(n);   

        sc.close();
    }
}
