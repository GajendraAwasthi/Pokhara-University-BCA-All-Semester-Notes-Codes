import java.util.*;
public class HelloVector {
    public static void main(String[] args){
        Vector<String> v = new Vector<>();
        v.add("Bibhu");
        v.add("Shrestha");

        System.out.println("The capacity is: "+v.capacity());
        v.remove(1);
        System.out.println("The remaining is: ");
        System.out.println(v.get(0));
    }

}
