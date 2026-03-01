

public class gcd {
    public  static int GCD(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return GCD(b, a%b);
        }
    }
    public static void main(String... args){
        int a = 128;
        int b = 16;

        System.out.println(" GCD of " + a + " and " + b + " is: " + GCD(a,b));
    }


}
