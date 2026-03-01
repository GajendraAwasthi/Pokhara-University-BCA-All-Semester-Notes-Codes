package Thread;

public class Natural extends Thread{
    @Override
    public void run(){
        for(int i =1; i <= 100; i++){
            System.out.println("Natural"+i);
        }
    }
}
