import java.util.Scanner;
public class Power {
    int powerfun(int b, int p){
        if (p == 0)
            return 1;
        else
            return b * powerfun(b,p-1);
    }
    public static void main(String[] args){
        Power obj = new Power();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base : ");
        int b = sc.nextInt();
        System.out.println("Enter power : ");
        int p = sc.nextInt();
        int result = obj.powerfun(b,p);
        System.out.println("Result is "+ result);
    }
}
