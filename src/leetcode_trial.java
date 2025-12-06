public class leetcode_trial {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] answer=new int[nums.length];
            int i=0;
            for(int j=i+1;j!=i;j++){
                if(j>nums.length){
                    j=0;
                }
                else{
                    answer[i]*=j;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args){

    }

}
