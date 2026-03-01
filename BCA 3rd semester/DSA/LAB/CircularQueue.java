package DsA;

public class CircularQueue {
    int[] queue_arr;
    int front,rear,size;
    CircularQueue(int max_size){
        queue_arr=new int[max_size];
        size=max_size;
        front=rear-1;
    }
    public void enqueue(int x){
        if(front==(rear+1)%size)
            System.out.println(" Queue is full");
        else if(front==-1){
            front=0;
            queue_arr[rear]=x;
        }
        else{
            rear=(rear+1)%size;
            queue_arr[rear]=x;
        }
    }
    public void dequeue(){
        int x;
        if(front==-1&& rear==-1){
            System.out.println("Queue is empty");
        }
        else if (front==rear){
            x=queue_arr[front];
            front=rear=-1;
            System.out.println("Deleted :"+x);
        }
else{
    x=queue_arr[front];
    front=(front + 1)%size;
            System.out.println("Deleted :" +x);
        }
    }
    public void diplay(){
        if(front==-1 && rear== -1)
            System.out.println("Queue is empty");
        else {
            int i = front;
            while (i != rear) {
                System.out.println(queue_arr[i] + " ");
                i = (i + 1) % size;
            }

            System.out.println(queue_arr[i]);
        }
    }
    public static void main(String... args){
        CircularQueue queue=new CircularQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(" Queue data are :");
        queue.diplay();
        queue.dequeue();
        System.out.println(" After deletion  data are :");
        queue.diplay();
    }
}
