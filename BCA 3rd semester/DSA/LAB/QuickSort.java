import java.util.Scanner;

public class QuickSort {
    int partition(int[] A,int l,int r){
        int x = A[r];
        int i=l-1;
        for(int j=l;j<r; j++ ){
            if(A[j]<=x){
                i++;
                int temp = A[i];
                A[i]=A[j];
                A[j]= temp;
            }

        }
        int temp = A[i+1];
        A[i+1]=A[r];
        A[r] = temp;

        return i+1;
    }
    void display(int A[]){
        for(int i=0; i<A.length; i++){
            System.out.println(A[i] + " ");
        }
    }
    void Quick_Sort(int[] A, int l, int r){
        if (l<r){
            int q = partition(A,l,r);
            Quick_Sort(A,l,q-1);
            Quick_Sort(A,q+1,r);
        }
    }

    public static void main(String... args) {
        QuickSort qs = new QuickSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int x = sc.nextInt();
        int[] A = new int[x];
        System.out.println("Enter the array element: ");
        for(int i =0; i<x;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Element before sort\n");
        qs.display(A);
        qs.Quick_Sort(A,0,x-1);
        System.out.println("Element after sort\n");
        qs.display(A);
        sc.close();

    }

}
