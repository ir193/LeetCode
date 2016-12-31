\\ https://leetcode.com/problems/summary-ranges
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> r = new ArrayList<String>();
        int last = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == nums.length - 1 || nums[i+1] != nums[i] + 1){
                if(nums[i] == nums[last]){
                    r.add(Integer.toString(nums[i]));
                }
                else{
                    r.add(nums[last] + "->" + nums[i]);
                }
                last = i+1;
            }
        }
        return r;
    }
}
