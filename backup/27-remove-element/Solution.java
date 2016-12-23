public class Solution {
    public int removeElement(int[] nums, int val) {
        /*
          int j = 0;
          for(int i = 0; i < nums.length; i++){
          if(nums[i] != val){
          nums[j] = nums[i];
          j++;
          }
          }
          return j;
        */
        int n = nums.length - 1;
        int i = 0;
        while(i <= n){
            if(nums[i] == val){
                //int t = nums[i];
                nums[i] = nums[n];
                //nums[n] = t;
                n--;
            }
            else{
                i++;
            }
        }
        return i;
    }
}
