package DsA;

public class StackLinkList {
    static class Node {
        int info;
        Node next;

        Node(int info) {
            this.info = info;
            this.next = null;
        }
    }
        Node top=null;
         void push(int x){
            Node newNode=new Node(x);
            if(top==null){
                newNode.next=null;
                top=newNode;
            }
            else{
                newNode.next=top;
                top=newNode;
            }
        }
        void pop(){
             Node temp;
              if(top==null){
                 System.out.println(" No Node");
             } else if (top.next==null) {
                 System.out.println( "Deleted data are:"+top.info);
                 top=null;
             }
             else{
                 temp=top;
                 top=temp.next;
                 System.out.println("Deleted data are:"+temp.info);
             }
        }
        void display(){
             Node temp;
             if (top==null){
                 System.out.println(" Stack is empty");

             }
             else{
                 temp=top;
                 while (temp!=null){
                     System.out.println( temp.info);
                     temp=temp.next;
                 }
             }
        }
        public static void main(String[] args){
             StackLinkList s=new StackLinkList();
             s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            System.out.println(" Data before pop :");
           s.display();
            s.pop();
            s.pop();
            System.out.println(" data after pop :");
            s.display();

        }
    }

