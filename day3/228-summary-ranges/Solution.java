public class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start = 0;
        List<String> r = new ArrayList<>();

        for(int i=0; i < nums.length; i++){
            if(i == nums.length - 1 || nums[i] + 1 != nums[i+1]){
                if(nums[start] == nums[i]){
                    r.add(String.valueOf(nums[i]));
                }
                else{
                    r.add(nums[start] + "->" + nums[i]);
                }

                start = i+1;
            }
        }
        return r;
    }
}
