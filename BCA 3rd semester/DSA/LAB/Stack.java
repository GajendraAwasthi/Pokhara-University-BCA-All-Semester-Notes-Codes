//package DsA;
//
//import java.net.SocketTimeoutException;
//import java.security.spec.RSAOtherPrimeInfo;
//
//public class Stack {
//    int[] stack_arr;
//    int top,size ;
//    Stack(int max_size){
//        stack_arr=new int[max_size];
//        size=max_size;
//        top=-1;
//    }
//    public boolean isFull(){
//        return top==size-1;
//    }
//    public boolean isEmpty(){
//        return top==-1;
//    }
//    public void push(int x){
//        if(isFull())
//            System.out.println("Stack is Overflow");
//        else{
//           stack_arr[++top]=x;
//
//        }
//    }
//    public void pop(){
//        if (isEmpty())
//            System.out.println("Stack is empty");
//        else{
//            int x;
//            x= stack_arr[top--];
//            System.out.println(" Deleted data :" +x);
//        }
//    }
//    public void display(){
//        if(isEmpty())
//            System.out.println("Stack is empty");
//        {
//            int i;
//            for(i=top;i>=0;i--){
//                System.out.println(stack_arr[i]);
//            }
//        }
//    }
//    public static void main(String...args){
//        Stack stack =new Stack(max_size: 5);
//        stack.push(x:10);
//        stack.push(x:20);
//        stack.push(x:30);
//        stack.push(x:40);
//        stack.push(x:50);
//        System.out.println(" stack data are :");
//        stack.display();
//        stack.push(x:60);
//        stack.pop();
//        System.out.println("After pop Stack data are :");
//        stack.display();
//    }
//
//}
