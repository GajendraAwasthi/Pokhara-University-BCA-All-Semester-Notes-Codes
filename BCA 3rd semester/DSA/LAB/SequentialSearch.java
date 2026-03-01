package DSA;

public class SequentialSearch {
    int search(int[]A, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (A[i] == x) {
                return i;
            }
        }

        return -1;

    }
    public static void main(String... args){
        SequentialSearch s = new SequentialSearch();
        int[] A = {1 , 2 , 3, 4, 5, 6, 7, 8};
        int x = 3;
        int n = s.search(A,A.length,x);

        if(n != -1){
            System.out.println("Found a element");

        } else{
            System.out.println("Not Found");
        }

    }
}