import java.util.Scanner;

//WAP to show an example of switch case statement
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        String day = sc.nextLine().toLowerCase();

        switch (day) {
            case "sunday":
                System.out.println("1");
                break;
            case "monday":
                System.out.println("2");
                break;
            case "tuesday":
                System.out.println("3");
                break;
            case "wednesday":
                System.out.println("4");
                break;
            case "thurday":
                System.out.println("5");
                break;
            case "friday":
                System.out.println("6");
                break;
            case "saturday":

                System.out.println("7");
                break;
            default:
                System.out.println("invalid");
                break;

        }
        sc.close();



    }
}
