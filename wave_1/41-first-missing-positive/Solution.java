\\ https://leetcode.com/problems/first-missing-positive

public class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0; i < nums.length; i++){
            int t = nums[i];
            while(t > 0 && t <= nums.length && nums[t-1] != nums[i]){
                int tmp = nums[t - 1];
                nums[t-1] = nums[i];
                nums[i] = tmp;
                t = tmp;
            }
        }

        for(int i=0; i < nums.length; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
}
