import java.util.Scanner;

public class search {

    int linearsearch(int a[],int n,int key){
        for(int i=0;i<n;i++){
            if(a[i]==key){
                return i;
            }
        }
        return 1;
    }

    int binarysearch(int a[],int left,int right,int key){
        while(left<=right){
            int mid=left+(right-left)/2;
            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]<key){
                return binarysearch(a,mid+1,right,key);
            }
            else{
                return binarysearch(a,left,mid-1,key);
            }
        }
        return -1;
    }

    int ternarysearch(int a[],int left,int right,int key){
        if(right>=left){
            int mid1=left+(right-left)/3;
            int mid2=right-(right-left)/3;
            if(a[mid1]==key){
                return mid1;
            }
            if(a[mid2]==key){
                return mid2;
            }
            if(key<a[mid1]){
                return ternarysearch(a,left,mid1-1,key);
            }
            else if(key>a[mid2]){
                return ternarysearch(a,mid2+1,right,key);
            }
            else{
                return ternarysearch(a,mid1+1,mid2-1,key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        search obj=new search();
        System.out.println("Linear Search:");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of array:");
//        int n=sc.nextInt();
//        int a[]=new int[n];
//        System.out.println("Enter the elements of array:");
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
        int a[]={5,10,15,20,25};
        int n=a.length;
        int key=10;
        int result=obj.linearsearch(a, n, key);
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element Found at index: "+result);
        }
        System.out.println("------------------------");
        System.out.println("Binary Search :");
        int b[]=new int[]{2,4,6,8,10,12,14,16,18,20};
        int n1=b.length;
        int key1=14;
        int left=0;
        int right=n1-1;
        int result2=obj.binarysearch(b, left, right, key1);
        if(result2==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element Found at index: "+result2);
        }
        System.out.println("------------------------");
        System.out.println("Ternary Search:");
        int c[]=new int[]{3,6,9,12,15,18,21,24,27,30};
        int n2=c.length;
        int key2=21;
        int left2=0;
        int right2=n2-1;
        int result3=obj.ternarysearch(c, left2, right2, key2);
        if(result3==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element Found at index: "+result3);
        }
    }
}
