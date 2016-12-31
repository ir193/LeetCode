\\ https://leetcode.com/problems/find-all-duplicates-in-an-array
public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int t = nums[i];
            while(t <= nums.length && nums[t-1] != t){
                int tmp = nums[t-1];
                nums[t-1] = nums[i];
                nums[i] = tmp;
                t = tmp;
            }
        }

        List<Integer> r = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i+1){
                r.add(nums[i]);
            }
        }
        return r;
    }
}
