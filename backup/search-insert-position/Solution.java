public class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo=0, hi=nums.length;
        int mi;
        while(lo < hi){
            mi = (lo + hi) / 2;
            if(nums[mi] < target){
                lo = mi + 1;
            }
            else{
                hi = mi ;
            }
        }
        return lo;
    }
}
