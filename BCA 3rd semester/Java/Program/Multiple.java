
public class Multiple {
    public static void main(String... args){
        try{

             int a = 10;
             int b = 1;

            int c = a / b;

             int[] d = {1,2,3,4,5,6,7,8,9,10};
             System.out.println(d[15]);


        } catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("i am okay");
        }


    }
}
