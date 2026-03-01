import java.util.Scanner;
public class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        int balance = 5;
        if (balance < 10) {
            try {
                throw new InsufficientFundException("Recharge........");
            } catch (InsufficientFundException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
// wap to read and write 8 bit data at a time.



