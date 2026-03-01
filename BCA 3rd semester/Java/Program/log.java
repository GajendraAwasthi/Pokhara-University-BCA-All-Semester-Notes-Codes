// WAP to demonstrate logical operations (AND, OR, NOT)
import java.util.Scanner;

public class log{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int c = sc.nextInt();

        int a = 10;
        int b = 20;


        if (c >= a && c <= b) {
            System.out.println("AND: The number is between " + a + " and " + b);
        } else {
            System.out.println("AND: The number is NOT between " + a + " and " + b);

        } if (c < a || c > b) {
            System.out.println("OR: The number is outside the range.");
        } else {
            System.out.println("OR: The number is inside the range.");
        }
        boolean isPositive = c > 0;
        System.out.println("NOT: Is the number NOT positive? " + (!isPositive));
    }
}



