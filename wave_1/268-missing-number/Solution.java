\\ https://leetcode.com/problems/missing-number
public class Solution {
    public int missingNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int t = nums[i];
            while(t < nums.length && nums[t] != t){
                int tmp = nums[t];
                nums[t] = nums[i];
                nums[i] = tmp;
                t = tmp;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
}
