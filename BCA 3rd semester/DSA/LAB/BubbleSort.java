import java.util.Scanner;

public class BubbleSort {

    void sort(int[] A) {
        int n = A.length;

        for (int i = 0; i < n - 1; i++) {
            int flag = 0;

            for (int j = 0; j < n - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    flag = 1;
                }
            }


            if (flag == 0) {
                break;
            }
        }
    }

    void display(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BubbleSort bs = new BubbleSort();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] A = new int[n];
        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        bs.sort(A);

        System.out.println("Sorted array:");
        bs.display(A);
    }
}
