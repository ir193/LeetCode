public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> r = new LinkedList<>();
        for(int i=0 ;i<nums.length; i++){
            int j = nums[i] - 1;
            while(nums[i] != nums[j]){
                // keep swap nums[i] to its supposed pos
                // until there is already one.
                int t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
                j = t - 1;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                r.add(nums[i]);
            }
        }
        return r;
    }
}
