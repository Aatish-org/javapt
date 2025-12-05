public class stack {
    int top,size,arr[];
    void Stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }

    void push(int data){
        if(top==size-1){
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            arr[top]=data;
        }
    }
    public static void main(String[] args) {

    }
}
