import java.util.Scanner;
public class StringOperation {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String :");
        String str = sc.nextLine();
        System.out.println("Length of first string : " +str.length());
        System.out.println(" Uppercase :" + str.toUpperCase());
        System.out.println(" lowercase : " +str.toLowerCase());
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(" Reversed String: " + reversed);
        System.out.println(" Enter another string  to compare :");
        String str2 = sc.nextLine();
        if(str.equals(str2)){
            System.out.println(" Both String are equal.");
        }
        else{
            System.out.println("  Both String are not equal . ");
        }
    }

}
