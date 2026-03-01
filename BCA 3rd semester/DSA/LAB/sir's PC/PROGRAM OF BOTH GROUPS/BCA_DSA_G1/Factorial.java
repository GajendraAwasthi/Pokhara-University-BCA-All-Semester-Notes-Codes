import java.util.Scanner;
public class Factorial {
    public int fact(int n){
        if(n == 0)
            return 1;
        else
           return n * fact(n-1);
    }
    public static void main(String[] args){
        int result;
        Scanner sc = new Scanner(System.in);
        Factorial f = new Factorial();
        System.out.println("Enter n : ");
        result = f.fact(sc.nextInt());
        System.out.println("Factorial is " + result);
    }
}
