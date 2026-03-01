import java.util.Scanner;
public class SequentialSearch {
    int search(int[] A, int n, int x){
        for(int i=0;i<n;i++){
            if(A[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        SequentialSearch obj = new SequentialSearch();
        Scanner sc = new Scanner(System.in);
        int[] A = {10,5,7,3,15,20,16,11};
        System.out.println("Enter data to be searched : ");
        int x = sc.nextInt();
        int result = obj.search(A,A.length,x);
        if(result != -1)
            System.out.println("Data found at index " + result );
        else
            System.out.println("Data not found");
        sc.close();
    }
}
