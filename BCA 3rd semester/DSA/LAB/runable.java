
public class runable {
    public static void main(String... args){
        Even e = new Even();
        Thread t = new Thread(e);
        t.start();


        odd o = new odd();
        Thread tr = new Thread(o);
        tr.start();


    }
}
class Even implements Runnable{
    public void run(){
        for(int i = 1000; i>=0; i-=2){
            System.out.println("even" + i);

        }
    }
}
class odd implements Runnable{
    public void run(){
        for(int i = 1; i<=100; i+=2){
            System.out.println("odd" + i);

        }
    }
}


