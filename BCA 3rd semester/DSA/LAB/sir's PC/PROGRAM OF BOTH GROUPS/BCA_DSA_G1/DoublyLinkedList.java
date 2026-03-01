public class DoublyLinkedList {
    static class Node{
        int info;
        Node next,prev;
        Node(int info){
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
}
