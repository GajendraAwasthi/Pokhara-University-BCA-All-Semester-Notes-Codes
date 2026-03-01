////WAP to create two thread the first will print odd number from 1 to 100. and
////second will print even number from 1000 to 1 in every 0.5 and 0.7 seconds
//public class EvenOdd {
//    public static void main(String... args){
//        Even e = new Even();
//        odd o = new odd();
//        e.start();
//        o.start();
//    }
//}
//class Even extends Thread{
//    public void run(){
//        for(int i = 1000; i>=0; i-=2){
//            System.out.println("even" + i);
//
//            try{
//                Thread.sleep(700);
//            }catch(Exception e){
//                System.out.println(e.getMessage());
//            }
//
//        }
//    }
//}
//class odd extends Thread{
//    public void run(){
//        for(int i = 1; i<=100; i+=2){
//            System.out.println("odd" + i);
//            try{
//                Thread.sleep(500);
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//
//        }
//    }
//}
//
//
