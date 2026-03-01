public class Queue {
    int[] queue_arr;
    int front,rear,size;
    //Constructor
    Queue(int max_size)
    {
        queue_arr = new int[max_size];
        size = max_size;
        front = rear = -1;
    }
    public void enqueue(int x)
    {
        if(rear == size-1)
            System.out.println("Queue is Overflow");
        else if(front == -1 && rear == -1) //empty
        {
            front = rear = 0;
            queue_arr[rear] = x;
        }
        else // already data
        {
            rear = rear + 1;
            queue_arr[rear] = x;
        }
    }
    public void dequeue()
    {
        int x;
        if(front == -1 && rear == -1)
            System.out.println("Queue is empty");
        else if(front == rear) // single element
        {
            x = queue_arr[front];
            front = rear = -1;
            System.out.println("Deleted data : "+x);
        }
        else // more than one data
        {
            x = queue_arr[front];
            front = front + 1;
            System.out.println("Deleted data : "+x);
        }
    }
    public void display()
    {
        if(front == -1 && rear == -1)
            System.out.println("Queue is empty");
        else
        {
            int i;
            for(i=front;i<=rear;i++)
            {
                System.out.print(queue_arr[i] + " ");
            }
        }
    }
    public static void  main(String[] args)
    {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.print("Queue Data are : ");
        queue.display();
        queue.dequeue();
        System.out.println("Queue Data are : ");
        queue.display();
    }
}
