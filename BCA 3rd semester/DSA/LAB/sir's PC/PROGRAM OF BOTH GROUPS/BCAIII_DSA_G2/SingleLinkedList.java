public class SingleLinkedList {
    static class Node {
        int info;
        Node next;
        Node(int info) {
            this.info = info;
            this.next = null;
        }
    }
    Node start = null;
    void insertFirst(int x){
        Node newNode = new Node(x);
        if(start == null){
            newNode.next = null;
        }
        else {
            newNode.next = start;
        }
        start = newNode;
    }
    void insertLast(int x){
        Node newNode = new Node(x);
        if(start == null){
            newNode.next = null;
            start = newNode;
        }
        else{
            Node temp = start;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
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
    void deleteFirst(){
        if(start == null)
            System.out.println("No node");
        else
            start = start.next;
    }
    void deleteLast(){
        if(start == null)
            System.out.println("No node");
        else if(start.next == null) // only one node
            start = null;
        else{
            Node temp = start;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public static void main(String[] args){
        SingleLinkedList obj = new SingleLinkedList();
        obj.insertFirst(10);
        obj.insertLast(20);
        obj.insertLast(30);
        obj.insertLast(40);
        System.out.println("Node data are :");
        obj.display();
        obj.deleteFirst();
        System.out.print("\nNode data are :");
        obj.display();
        obj.deleteLast();
        System.out.print("\nNode data are :");
        obj.display();
    }
}
