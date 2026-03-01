// wap to create a hashmap nkey value pair to store and display contact of 10 person.
// wap to illustrate the example of vector class
import java.util.HashMap;
public class ContactList {
    public static void main(String[] args){
        HashMap<String, String> hm = new HashMap<>();

        hm.put("Hemant", "9898676787");
        hm.put("Gazz", "9898476787");
        hm.put("Guzz", "9898676787");
        hm.put("Bibhu", "9897676787");
        hm.put("Asmita", "9898676787");
        hm.put("Ajju", "9898176787");
        hm.put("Anish", "9828676787");
        hm.put("Kamal", "9898676787");
        hm.put("Laalpari", "7898676787");
        hm.put("Kp oli", "9838676787");

        System.out.println("Contact List: ");
        for (String name : hm.keySet()) {
            System.out.println("Name: " + name + ", Phone: " + hm.get(name));
        }
    }

}
