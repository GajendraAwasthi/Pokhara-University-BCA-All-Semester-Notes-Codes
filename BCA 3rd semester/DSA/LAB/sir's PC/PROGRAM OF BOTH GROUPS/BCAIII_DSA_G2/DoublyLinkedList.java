public class DoublyLinkedList {
    static class Node {
        int info;
        Node next,prev;
        Node(int info) {
            this.info = info;
            this.next = null;
            this.prev = null;
        }
    }
    Node start = null;
    void insertFirst(int x){
        Node newNode = new Node(x);
        if(start == null){
            start = newNode;
        }
        else {
            start.prev = newNode;
            newNode.next = start;
            start = newNode;
        }
    }
    void insertLast(int x){
        Node newNode = new Node(x);
        if(start == null){
            start = newNode;
        }
        else {
            Node temp = start;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    void display(){
        if(start == null){
            System.out.println("No Node");
        }
        else{
            Node temp = start;
            while(temp != null){
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args){
        DoublyLinkedList obj = new DoublyLinkedList();
        obj.insertFirst(10);
        obj.insertLast(20);
        obj.insertLast(30);
        obj.insertFirst(5);
        System.out.println("Data are : ");
        obj.display();
    }
}

