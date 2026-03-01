package DSA;

public class DoublyLinkList {

    static class Node {
        int info;
        Node next;
        Node previous;

        Node(int info) {
            this.info = info;
        }
    }

    Node start = null;


    void insertFirst(int x) {
        Node newNode = new Node(x);

        if (start == null) {
            start = newNode;
        } else {
            newNode.next = start;
            start.previous = newNode;
            start = newNode;
        }
    }


    void insertLast(int x) {
        Node newNode = new Node(x);

        if (start == null) {
            start = newNode;
        } else {
            Node temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.previous = temp;
        }
    }


    void display() {
        if (start == null) {
            System.out.println("No Node");
        } else {
            Node temp = start;
            while (temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }


    void displayReverse() {
        if (start == null) {
            System.out.println("No Node");
        } else {
            Node temp = start;

            while (temp.next != null) {
                temp = temp.next;
            }

            while (temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.previous;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DoublyLinkList obj = new DoublyLinkList();

        obj.insertFirst(10);
        obj.insertLast(20);
        obj.insertLast(30);
        obj.insertFirst(5);

        System.out.println("Forward Display:");
        obj.display();

        System.out.println("Reverse Display:");
        obj.displayReverse();
    }
}
