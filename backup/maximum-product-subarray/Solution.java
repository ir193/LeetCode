public class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0], max = nums[0], min = nums[0];
        for(int i=1; i< nums.length; i++){
            int x = min*nums[i], y = max*nums[i];
            min = Math.min(nums[i], Math.min(x, y));
            max = Math.max(nums[i], Math.max(x, y));
            ans = Math.max(ans, max);
        }
        return ans;
        
    }
}
