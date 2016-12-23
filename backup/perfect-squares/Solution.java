public class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=1; i<n+1; i++){
            //System.out.println(Math.sqrt(i) +" " + i);
            if(Math.floor(Math.sqrt(i))*Math.floor(Math.sqrt(i)) == i){
                dp[i] = 1;
            }
            else{
                for(int j=1; j*j < i; j++){
                    dp[i] = Math.min(dp[i - j*j] + 1, dp[i]);
                }
            }
        }
        //System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
