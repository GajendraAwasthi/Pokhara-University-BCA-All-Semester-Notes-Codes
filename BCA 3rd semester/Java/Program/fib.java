
import java.util.Scanner;

public class fib{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, c = 0, num, count =0;
        System.out.println("Enter how many number; ");
        num = sc.nextInt();
        System.out.print(a+ " ");
        System.out.print(b + " " );
        while(count != num){
            c = a+b;
            System.out.print(c + " ");
            count++;
            a = b;
            b = c;
        }
        sc.close();
    }
}
