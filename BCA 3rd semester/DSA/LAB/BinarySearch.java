import java.util.Scanner;
public class BinarySearch {
    int bsearch(int[] A,int x, int low,int high){
        if(low > high)
            return -1; // not found
        else {
            int mid = (low + high) / 2;
            if (x == A[mid])
                return 1; // data found
            else if (x > A[mid]) {
                low = mid + 1;
                return bsearch(A, x, low, high);
            } else {
                high = mid - 1;
                return bsearch(A, x, low, high);
            }
        }
    }
    public static void main(String []args){
        BinarySearch obj = new BinarySearch();
        //Data must be sorted for binary search
        int[] A = {10,20,30,40,50,60,70};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to be searched : ");
        int x = sc.nextInt();
        int result = obj.bsearch(A,x,0,A.length-1);
        if(result == 1)
            System.out.println("Data found");
        else
            System.out.println("Data not found");
    }
}
