\\ https://leetcode.com/problems/remove-element
public class Solution {
    public int removeElement(int[] nums, int val) {
        /*
          int k = 0;
          for(int i : nums){
          if(i != val){
          nums[k] = i;
          k++;
          }
          }
          return k;
        */
        int i = 0;
        int j = nums.length;
        while(i < j){
            if(nums[i] == val){
                j--;
                nums[i] = nums[j];
            }
            else{
                i++;
            }
        }
        return i;
    }
}
