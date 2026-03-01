package DsA;


    public class QueueLinkList {
        static class Node {
            int info;
            Node next;


            Node(int info) {
                this.info = info;
                this.next = null;


            }
        }

        Node front = null, rear = null;

        void enqueue(int x) {
            Node newNode = new Node(x);
            if (front ==null && rear== null) {
                front = newNode;
                rear = newNode;
            }
            else{
                    rear.next = newNode;
                    rear = newNode;
                }
            }


        void dequeue() {
            Node temp;
            if (rear == null && front == null) {
                System.out.println(" No Node");
            } else if (front.next == null) {
                System.out.println("Deleted data are:" + front.info);
                front = null;
                rear = null;
            } else {
                temp = front;
                front = temp.next;
                System.out.println("Deleted data are:" + temp.info);
            }
        }

        void display() {
            Node temp;
            if (front == null) {
                System.out.println(" Stack is empty");
            } else {
                temp = front;
                while (temp != null) {
                    System.out.println(temp.info);
                    temp = temp.next;
                }
            }
        }

        public static void main(String[] args) {
            QueueLinkList s = new QueueLinkList();
            s.enqueue(10);
            s.enqueue(20);
            s.enqueue(30);
            s.enqueue(40);
            System.out.println(" Data before dequeue :");
            s.display();
            s.dequeue();
            s.dequeue();
            System.out.println(" data after dequeue :");
            s.display();

        }
    }


