import java.util.Scanner;
public class TowerofHanoi {
    void TOH(int n,char src,char aux,char dest)
    {
        if(n != 0)
        {
            TOH(n-1,src,dest,aux);
            System.out.println("Move disc " + n + " from " + src + " to " + dest);
            TOH(n-1,aux,src,dest);
        }
    }
    public static void main(String[] args){
        TowerofHanoi th = new TowerofHanoi();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of disc : ");
        int n = sc.nextInt();
        th.TOH(n,'A','B','C');
    }
}
