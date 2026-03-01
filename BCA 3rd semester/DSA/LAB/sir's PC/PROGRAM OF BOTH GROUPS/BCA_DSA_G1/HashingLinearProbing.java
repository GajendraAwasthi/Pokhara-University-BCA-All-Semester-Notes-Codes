import java.util.Scanner;

public class HashingLinearProbing {
    int [] hashtable;
    int tablesize;
    private final int empty = -1;
    HashingLinearProbing(int tablesize){
        this.tablesize = tablesize;
        hashtable = new int[tablesize];
        //initialize all index empty
        for(int i=0;i<tablesize;i++){
            hashtable[i] = empty;
        }
    }
    //hash function
    private int hashfunction(int key){
        return key%tablesize;
    }
    //insert
    void insert(int key){
        int h = hashfunction(key);
        for(int i =0;i<tablesize;i++){
            int index = (h+i)%tablesize; // linear probing
            if(hashtable[index]==empty){
                hashtable[index] = key;
                return;
            }
        }
        System.out.println(key + "cannot be inserted");
    }
    //display
    void display(){
        for(int i = 0; i<tablesize;i++){
            System.out.printf("Hashtable[%d] : ",i);
            if(hashtable[i] == empty)
                System.out.println("Empty");
            else
                System.out.println(hashtable[i]);
        }
    }
    boolean search(int x){
        int h = hashfunction(x);
        for(int i =0;i<tablesize;i++){
            int index = (h+i)%tablesize; // linear probing
            if(hashtable[index]==x)
                return true;
            else
                return false;
        }
        return false;
    }

    public static void main(String[] args){
        HashingLinearProbing obj = new HashingLinearProbing(5);
        obj.insert(10);
        obj.insert(14);
        obj.insert(24);
        obj.insert(12);
        System.out.println("Hashing with linear probing : ");
        obj.display();
        System.out.println("Enter data to be searched : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(obj.search(x))
            System.out.println("Data Found");
        else
            System.out.println("Data not Found");
    }
}
