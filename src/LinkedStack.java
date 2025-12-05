public class LinkedStack {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;
//    LStack(){top=null;}

    void push(int data){
        Node n=new Node(data);
        if(top==null){top=n;}
        else{
            n.next=top;
            top=n;
        }
    }

    void pop(){
        if(top==null){System.out.println("LinkedStack is Empty");}
        else{
            top.next=top;
        }
    }

    void peek(){
        if(top==null){System.out.println("LinkedStack is Empty");}
        else{
            System.out.println("Top Element is"+top);
        }
    }


    public static void main(String[] arg){
        

    }
}
