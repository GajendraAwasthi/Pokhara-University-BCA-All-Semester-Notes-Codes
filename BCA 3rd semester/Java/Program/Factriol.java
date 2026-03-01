
public class Factriol {
    public int fact(int n) {
        if (n == 0)
            return 1;
        else
            return n*fact(n-1);
    }
    public void main(String...args){
        
        int result;
        Factriol f=new Factriol();
        result=f.fact(5);
        System.out.println("Factriol is"+result);

    }
}
