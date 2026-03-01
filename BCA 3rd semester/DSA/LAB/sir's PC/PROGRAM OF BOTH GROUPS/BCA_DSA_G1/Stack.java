public class Stack {
    int[] stack_arr;
    int top,size;
    //constructor
    Stack(int max_size)
    {
        stack_arr = new int[max_size];
        size = max_size;
        top = -1; //empty
    }
    public boolean isFull()
    {
        return top == size-1;
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    //to insert
    public void push(int x)
    {
        if(isFull())
            System.out.println("STack is overflow");
        else {
            //top = top + 1;
            stack_arr[++top] = x;
        }
    }
    //to delete
    public void pop()
    {
        if(isEmpty())
            System.out.println("Stack is empty");
        else {
            int x;
            x = stack_arr[top--];
            //top = top-1;
            System.out.println("Deleted data : "+ x);
        }
    }
    //to display
    public void display()
    {
        if(isEmpty())
            System.out.println("Stack is empty");
        else {
            int i;
            for(i=top;i>=0;i--)
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
        stack.push(40);
        stack.push(50);
        System.out.println("Stack data are : ");
        stack.display();
        stack.push(60); ///overflow msg
        //remove
        stack.pop();
        System.out.println("After pop Stack data are : ");
        stack.display();


    }
}
