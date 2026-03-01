//WAP to create two function one dont take parameter and return value
// and another take parameter and return value. create obj of class and call necessary
//method



class MyClass {
    int getNumber() {
        return 10;
    }

    int square(int num) {
        return num * num;
    }
}

public class TwoFunction {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        int value = obj.getNumber();
        System.out.println("Value returned: " + value);

        int result = obj.square(5);
        System.out.println("Square of 5: " + result);
    }
}
