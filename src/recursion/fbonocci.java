package recursion;

//

public class fbonocci {
    void recursivenum(int n1,int n2){
        if(n1>n2) return;
        System.out.print(n1+" ");
        recursivenum(n1+1,n2);
    }
    public static void main(String[] args){
        fbonocci bb=new fbonocci();
        bb.recursivenum(1,10);
    }
}


