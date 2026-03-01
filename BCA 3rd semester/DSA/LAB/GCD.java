package DsA;

public class GCD {
    static double gcd1(double a,double b){
        if(b==0){
            return a;
        }
        else{
            return gcd1(b,a%b);
        }

    }
    public static void main(String...args){
        double a=2451;
        double b=25;
        gcd1(a,b);
        System.out.println(" GCD of " +a+ "and " +b+ " is "+gcd1(a,b));

    }
}
