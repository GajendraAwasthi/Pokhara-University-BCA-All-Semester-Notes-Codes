public class QueueUsingLinkedList {
    static class Node{
        int info;
        Node next;
        Node(int info){
            this.info = info;
            this.next = null;
        }
    }
    Node front=null,rear=null;
    void enqueue(int x){
        Node newNode = new Node(x);
        if(front==null && rear==null){
            front=newNode;
            rear=newNode;
        }
        else{
            rear.next=newNode;
            rear=newNode;
        }
    }
    void dequeue(){
        Node temp;
        if(rear==null&&front==null) {
            System.out.println("  No node");
        }
            else if (front.next==null){
                System.out.println(" deleted data are: "+ front.info);
           front=null;
           rear=null;
            }
            else{
                temp=front;
                front=temp.next;
                System.out.println(" deleted data are: " +temp.info);
            }
        }
        void display(){
        Node temp;
        if(front==null){
        }
    }

