public class Solution {
    public int removeDuplicates(int[] nums) {

        /*
          if(nums.length == 0){
          return 0;
          }
          int last = nums[0];
          int n = 1;
          for(int i=1; i<nums.length; i++){
          if(nums[i] != last){
          nums[n] = nums[i];
          n++;
          last = nums[i];
          }
          }
          return n;
        */

        /*
          int i = 0;
          for(int n : nums){
          if(i == 0 || nums[i-1] != n){
          nums[i] = n;
          i++;
          }
          }
          return i;
        */

        int i = 0;
        for(int n : nums){
            if(nums[i] != n){
                i++;
                nums[i] = n;
            }
        }
        return i+1;
    }
}
