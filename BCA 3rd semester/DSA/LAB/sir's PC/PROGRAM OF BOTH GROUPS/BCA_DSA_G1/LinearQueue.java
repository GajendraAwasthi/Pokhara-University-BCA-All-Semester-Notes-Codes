public class LinearQueue {
    int[] queue_arr;
    int front,rear,size;

    LinearQueue(int max_size){
        queue_arr = new int[max_size];
        size = max_size;
        front=rear=-1; //empty
    }
    //insert
    public void enqueue(int x){
        if(rear == size-1)
            System.out.println("Queue is Full");
        else if(front == -1 && rear == -1){
            front = rear = 0;
            queue_arr[rear] = x;
        }
        else{
            rear = rear + 1;
            queue_arr[rear] = x;
        }
    }
    //delete
    public void dequeue(){
        int x;
        if(front == -1 && rear == -1)
            System.out.println("Queue is empty");
        else if(front == rear) {//Single element
            x = queue_arr[front];
            front = rear = -1;
            System.out.println("Data deleted : " + x);
        }
        else{
             x = queue_arr[front];
             front = front + 1;
            System.out.println("Data deleted : " + x);
        }
    }
    //display
    public void display(){
        if(front == -1 && rear == -1)
            System.out.println("Queue is empty");
        else {
            int i;
            for(i=front;i<=rear;i++){
                System.out.print(queue_arr[i] + " ");
            }
        }
    }
    public static void main(String[] args){
        LinearQueue queue = new LinearQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Queue data are : ");
        queue.display();
        //remove
        queue.dequeue();
        System.out.println("After deletion data are : ");
        queue.display();
    }
}
