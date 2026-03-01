public class SinglyLinkedList {
    static class Node{
        int info;
        Node next;
        Node(int info){
            this.info = info;
            this.next = null;
        }
    }
    Node start = null;
    void insertFirst(int x){
        Node newNode = new Node(x);
        if(start == null)
            start = newNode;
        else{
            newNode.next = start;
            start = newNode;
        }
    }
    void insertLast(int x){
        Node newNode = new Node(x);
        if(start == null)
            start = newNode;
        else{
            Node temp = start;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    void display(){
        if(start == null)
            System.out.println("No Node");
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
            System.out.println("No Node");
        else{
              start = start.next; //delete start
        }
    }
    void deleteLast(){
        if(start == null)
            System.out.println("No Node");
        else if(start.next == null) //only one node
            start = null; // delete start
        else{
            Node temp = start;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null; //delete last
        }
    }
    void search(int x){
        if(start == null)
            System.out.println("No Node");
        else{
            Node temp = start;
            boolean found = false;
            while(temp != null){
                if(temp.info == x){
                    found = true;
                    break;
                }
                temp = temp.next;
            }
            if(found)
                System.out.print("\nData Found");
            else
                System.out.print("\nNot found");
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        obj.insertFirst(10);
        obj.insertLast(20);
        obj.insertLast(30);
        obj.insertFirst(5);
        System.out.println("Data are : ");
        obj.display();
        obj.deleteFirst();
        System.out.print("\nData are : ");
        obj.display();
        obj.deleteLast();
        System.out.print("\nData are : ");
        obj.display();
        obj.search(10);
    }
}
