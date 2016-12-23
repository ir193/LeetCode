public class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }

        int x, y;
        int first0;    // do not rob the first house
        int first1;    // rob the first house

        x = 0;         // we dont rob the first house, the max of first == 0
        y = 0;
        for(int i=1; i<nums.length; i++){
            // iter from the second house,
            // stop at the last because the last one is safe
            int yy = y;
            y = x;
            x = Math.max(yy + nums[i], x);
        }
        first0 = x;

        x = nums[0];  // we rob the first 
        y = 0;
        for(int i=1; i<nums.length-1; i++){
            // iter stop at the second last, because it's always unsafe
            int yy = y;
            y = x;
            x = Math.max(yy + nums[i], x);
        }
        first1 = x;

        return Math.max(first0, first1);
    }
}
