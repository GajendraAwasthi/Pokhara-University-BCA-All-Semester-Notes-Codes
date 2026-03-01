public class SingleLinkedLIST {
    static class Node {
        int data;
        int info;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node start = null;

    void insertFirst(int x) {
        Node newNode = new Node(x);
        if (start == null) {
            newNode.next = null;
        } else {
            newNode.next = start;
        }
        start = newNode;
    }

    void insertLast(int x) {
        Node newNode = new Node(x);
        if (start == null) {
            newNode.next = null;
            start = newNode;
        } else {
            Node temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display() {
        if (start == null) {
            System.out.println("no node");
        } else {
            Node temp = start;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    void deleteFirst() {
        if (start == null)
            System.out.println("No Node");
        else {
            start = start.next;
        }
    }

    void deleteLast() {
        if (start == null)
            System.out.println("No Node");
        else if (start.next == null) {
            start = null;
        } else {
            Node temp = start;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;


        }
    }

    void search(int x) {
        if (start == null) {
            System.out.println("NO Node");

        } else {
            Node temp = start;
            boolean found = false;
            while (temp != null) {
                if (temp.info == x) {
                    found = true;
                    break;
                }
                temp = temp.next;

            }
            if (found) {
                System.out.println("data found" + " " + x);

            } else {
                System.out.println("data not found" + " " + x);

            }

        }

    }

    public static void main(String[] args) {
        SingleLinkedLIST obj = new SingleLinkedLIST();
        obj.insertFirst(10);
        obj.insertLast(20);
        obj.insertLast(30);
        obj.insertFirst(5);
        System.out.println("Data are : ");
        obj.display();
        obj.deleteFirst();
        System.out.println("\nData are: ");
        obj.display();
        obj.deleteLast();
        System.out.println("\nData are: ");
        obj.display();
        obj.search(10);
    }
}