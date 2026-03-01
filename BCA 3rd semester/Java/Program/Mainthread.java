package Thread;

public class Mainthread {
    static void main() {
        Odd o=new Odd();
        o.start();
        EvenNumber e=new EvenNumber();
        e.start();

    }
}
