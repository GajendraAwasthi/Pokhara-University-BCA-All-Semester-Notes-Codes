import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter how many item you want yo add: ");
        int item = sc.nextInt();
        sc.next();
        for(int i =0; i<item; i++){
            names.add(sc.nextLine());
        }
        System.out.println("Total item: " + names.size());
        System.out.println("Enter one more item: ");
        names.add(sc.nextLine());

        for(String s:names){
            System.out.println(s);
        }

        names.removeFirst();
        System.out.println("Total Item after remove: " + names.size());
        sc.close();

        names.addFirst("bibhu");
        System.out.println("add" + sc.nextLine());

    }
}
