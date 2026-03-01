package Thread;

public class EvenNumber extends Thread {
    @Override
    public void run()
    {
        for (int i = 1000; i>0; i -= 2){
            System.out.println("even is:"+i);
            try {
                Thread.sleep(700);
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
