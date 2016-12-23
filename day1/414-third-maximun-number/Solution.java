public class Solution {
    public int thirdMax(int[] nums) {
        int min = -1, mid = -1, max = -1;
        boolean hasMin = false, hasMid = false, hasMax = false;
        for (int val : nums){
            if ((hasMax && val == max) || (hasMid && val == mid) || (hasMin && val == min)){
                continue;
            }
            if (!hasMax || val > max){
                min = mid;
                mid = max;
                max = val;
                hasMin |= hasMid;
                hasMid |= hasMax;
                hasMax = true;
            }else if (!hasMid || val > mid){
                min = mid;
                mid = val;
                hasMin |= hasMid;
                hasMid = true;
            }else if (!hasMin || val > min){
                min = val;
                hasMin = true;
            }
        }
        return hasMin ? min : max;
    }
}
