public class StackUsingLinkedList {
    static class Node {
        int info;
        Node next;
        Node(int info) {
            this.info = info;
            this.next = null;
        }
    }
        Node top = null;
    void Push(int x){
        Node newNode = new Node(x);
        if(top == null){
            newNode.next = null;
        }
        else {
            newNode.next = top;
        }
        top = newNode;
    }
    void pop(){
        if(top == null)
            System.out.println("No Node");
        else {
            Node temp = top;
            top = top.next;
            temp = null;
        }
    }
    void display(){
        if(top == null){
            System.out.println("No Node");
        }
        else{
            Node temp = top;
            while(temp != null){
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
        }
    }

}
