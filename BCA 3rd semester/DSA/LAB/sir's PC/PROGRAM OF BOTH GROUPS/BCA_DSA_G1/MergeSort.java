import java.util.Scanner;

public class MergeSort {
    public void merge(int[] A, int l, int mid, int r){
        int []B = new int[A.length];
        int i=l,j=mid+1,k=l;
        while(i<=mid && j<=r){
            if(A[i] < A[j]){
                B[k]=A[i];
                i++;
                k++;
            }
            else{
                B[k]=A[j];
                j++;
                k++;
            }
        }
        if(i>mid){
            while(j<=r){
                B[k]=A[j];
                j++;
                k++;
            }
        }
        else {
            while(i<=mid){
                B[k]=A[i];
                i++;
                k++;
            }
        }
        for(k=l;k<=r;k++){
            A[k]=B[k];
        }
    }
    public void merge_sort(int[] A, int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            merge_sort(A,l,mid);
            merge_sort(A,mid+1,r);
            merge(A,l,mid,r);
        }
    }
    void display(int[] A){
        for (int i=0;i<A.length;i++){
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String []args){
        MergeSort obj = new MergeSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int []A = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        System.out.printf("\nBefore Sort : ");
        obj.display(A);
        //sorting
        obj.merge_sort(A,0,n-1);
        System.out.printf("\nAfter Sort : ");
        obj.display(A);
        sc.close();
    }
}
