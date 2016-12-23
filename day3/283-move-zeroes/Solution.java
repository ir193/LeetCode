public class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int x : nums){
            if(x != 0){
                nums[i++] = x;
            }
        }
        for(int j=i; j < nums.length; j++){
            nums[j] = 0;
        }
    }
}
