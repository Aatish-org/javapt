import java.util.Arrays;

class array {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int high_num=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>high_num){
                high_num=arr[i];
            }
        }
        System.out.println("High Number is "+high_num);
    }
}