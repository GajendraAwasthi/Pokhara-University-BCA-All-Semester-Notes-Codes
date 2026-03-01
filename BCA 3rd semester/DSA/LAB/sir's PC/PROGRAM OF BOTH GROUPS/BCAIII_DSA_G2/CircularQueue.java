public class CircularQueue {
    int[] queue_arr;
    int size,front,rear;

    CircularQueue(int max_size)
    {
        queue_arr = new int[max_size];
        size = max_size;
        front = rear = -1;
    }

    public void enqueue(int x)
    {
        if(front == (rear + 1) %size)
            System.out.println("Queue is Full");
        else if(front == -1 && rear == -1)
        {
            front = rear = 0;
            queue_arr[rear] = x;
        }
        else
        {
            rear = (rear +  1)%size;
            queue_arr[rear] = x;
        }
    }
    public void dequeue()
    {
        int x;
        if(front == -1 && rear == -1)
            System.out.println("Queue is empty");
        else if(front == rear) // single data
        {
            x = queue_arr[front];
            front = rear = -1;
            System.out.println("Deleted data : " + x);
        }
        else
        {
            x = queue_arr[front];
            front = (front + 1) % size;
            System.out.println("Deleted data : " + x);
        }
    }
    public void display()
    {
        if(front == -1 && rear == -1)
            System.out.println("Queue is empty");
        else {
            int i = front;
            while( i != rear)
            {
                System.out.print(queue_arr[i] + " ");
                i = (i + 1)%size;
            }
            System.out.println(queue_arr[i]);
        }
    }

    public static void main(String[] args)
    {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Data are  : ");
        queue.display();
        queue.enqueue(60); // show queue is full
        queue.dequeue(); // front data is deleted
        System.out.println("After deleted data are: ");
        queue.display();
    }
}
