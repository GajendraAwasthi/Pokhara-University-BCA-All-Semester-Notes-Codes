import java.util.Arrays;
import java.util.HashSet;

//create a dyanamic array(hashset) that holds unique list
public class SetDEMO {
    public static void main(String[] args) {
        HashSet<String> names= new HashSet<>();
        System.out.println("Intial Item:" + names.size());

        names.add("bibhu");
        names.add("bibhu shrestha");

        System.out.println("Total item:"+ names.size());

        for(String n:names){
            System.out.println(n);
        }

        names.removeAll(Arrays.asList("bibhu", "bibhu shrestha"));
        System.out.println(names.size());
        System.out.println(names.isEmpty());

    }
}
