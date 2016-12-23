public class Solution {
    public void rotate(int[] nums, int k) {
        int m = gcd(nums.length, k);
        int n = nums.length / m;
        for(int i=0; i < m; i++){
            int p = nums[i];
            for(int j=0; j < n; j++){
                int t = nums[(i + (j+1) * k ) % nums.length];
                nums[(i + (j+1) * k ) % nums.length] = p;
                p = t;
            }
        }
    }

    private int gcd(int a, int b){
        if(a < b){
            int t = a;
            a = b;
            b = t;
        }
        while(b > 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
