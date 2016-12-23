public class Solution {
    public int missingNumber(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int target = nums[i];
            while(target != i && target < nums.length && target != nums[target]){
                int tmp = nums[target];
                nums[target] = nums[i];
                nums[i] = tmp;
                target = tmp;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(i != nums[i] ){
                return i;
            }
        }
        return nums.length;
    }
}
