package Thread;

public class Odd extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i -= 2) {

            System.out.println("odd:" + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}