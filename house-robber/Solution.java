public class Solution {
    public int rob(int[] nums) {
        int x=0;    // max value
        int y=0;    // max and do not rob current house

        for(int i : nums){
            // in every iter, x/y becomes max/max_without_rob on the LAST house
            int last_y = y;
            y = x;
            x = Math.max(x, last_y+i);
        }
        return x;
    }
    public int rob2(int[] nums){
        // it appears unnecessary to store all max values

        int n = nums.length;
        if(n==0){
            return 0;
        }
        int[] rob = new int[n];
        if(n >= 1){
            rob[0] = nums[0];
        }
        if(n >= 2){
            rob[1] = Math.max(nums[0], nums[1]);
        }
        for(int i=2; i<n; i++){
            rob[i] = Math.max(rob[i-1], rob[i-2]+nums[i]);
        }
        return rob[n-1];
    }
}
