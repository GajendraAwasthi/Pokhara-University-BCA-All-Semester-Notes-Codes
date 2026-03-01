package Thread;

public class Fibo implements Runnable{
    int a=0,b=1,c;
    @Override
    public void run(){
        System.out.println(a);
        System.out.println(b);
        for(int i=3;i<=20;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
