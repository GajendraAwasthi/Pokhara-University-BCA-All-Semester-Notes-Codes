import java.util.Scanner;

public class Grade {
    public static void  main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many student you want: ");
        int num = sc.nextInt();
        for(int i = 1; i<= num; i++){
            System.out.println("Enter the Grade: ");
            int mark = sc.nextInt();
            if(mark>=90){
                System.out.println("A");
            } else if (mark<90 && mark>=85) {
                System.out.println("A-");

            }else if (mark<85 && mark>=80) {
                System.out.println("A-");

            }else if (mark<80 && mark>=75) {
                System.out.println("A-");

            }else if (mark<75 && mark>=70) {
                System.out.println("A-");

            }else if (mark<70 && mark>=65) {
                System.out.println("A-");

            }else if (mark<65 && mark>=60) {
                System.out.println("A-");

            }else if (mark<60 && mark>=55) {
                System.out.println("A-");

            }else if (mark<=90 && mark>=85) {
                System.out.println("A-");

            }else if (mark<=90 && mark>=85) {
                System.out.println("A-");

            }else if (mark<=90 && mark>=85) {
                System.out.println("A-");

            }else if (mark<=90 && mark>=85) {
                System.out.println("A-");

            }else if (mark<=90 && mark>=85) {
                System.out.println("A-");

            }
        }

    }
}
