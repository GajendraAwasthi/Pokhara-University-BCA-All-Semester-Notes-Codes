public class doublylinkedlist {

    // Node class
    static class Node {
        int info;
        Node next, prev;

        Node(int info) {
            this.info = info;
            // this.prev = null;
            // this.next = null;
        }
    }

    Node start = null;

    // Insert at first
    void insertFirst(int x) {
        Node newNode = new Node(x);

        if (start == null) {
            start = newNode;
        } else {
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
        }
    }

    // Insert at last
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
            newNode.prev = temp;
        }
    }

    // Display list
    void display() {
        if (start == null) {
            System.out.println("No node");
        } else {
            Node temp = start;
            while (temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        doublylinkedlist obj = new doublylinkedlist();

        obj.insertFirst(10);
        obj.insertLast(20);
        obj.insertLast(30);
        obj.insertFirst(5);

        System.out.println("Data are:");
        obj.display();
    }
}
