public class Stack {
    int[] stack_arr;
    int top,size;// intially stack is empty

    //constructor
    Stack(int max_size)
    {
        stack_arr = new int[max_size]; // array intialize
        size = max_size; // set max_size of stack
        top = -1;
    }
    //IsEmpty
    public boolean isEmpty()
    {
        return top == -1;
    }
    //IsFull
    public  boolean isFull()
    {
        return top == size-1;
    }
    //PUSH function
    public void push(int x)
    {
        if(isFull())
            System.out.println("Stack is Overflow");
        else
        {
            stack_arr[++top] = x;
            System.out.println("Data is inserted : " + x);
        }
    }
    //POP function
    public void pop()
    {
        if(isEmpty())
            System.out.println("Stack is Empty");
        else
        {
            int x;
            x = stack_arr[top--];
            System.out.println("Data is deleted : "+x);
        }
    }
    //Display
    public void display()
    {
        if(isEmpty())
            System.out.println("Stack is Empty");
        else
        {
            int i;
            for (i = top; i>=0;i--)
            {
                System.out.println(stack_arr[i]);
            }
        }
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack data are :");
        stack.display();
        stack.pop();
        System.out.println("After pop Stack data are :");
        stack.display();

    }
}
