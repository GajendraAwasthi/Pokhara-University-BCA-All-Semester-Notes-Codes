import java.util.Scanner; 
public class Fibonacci {
    public int fibo(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args){
        Fibonacci f = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of terms : ");
        int n = sc.nextInt();
        System.out.println("Fibonacci series : ");
        for(int i = 0; i < n; i++){
            System.out.print(f.fibo(i) + " ");
        }
    }
}
