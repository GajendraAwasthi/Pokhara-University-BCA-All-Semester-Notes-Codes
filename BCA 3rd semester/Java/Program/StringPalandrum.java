
import java.util.Scanner;
public class StringPalandrum {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String :");
        String str = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(" Reversed String: " + reversed);

        if(str.equals(reversed)){
            System.out.println(" This string is palandrum");
        }
        else{
            System.out.println("  This string is not palandrum ");
        }
    }
}


