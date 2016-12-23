public class Solution {
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        if(n == 0){
            return 0;
        }
        int m = matrix[0].length;
        if(m == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int[][] dp = new int[n][m];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = matrix[i][j] - '0';
                }
                else if(matrix[i][j] == '0'){
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
                }
                
                max = Math.max(max, dp[i][j]);
            }
        }
        /*
          for(int[] i: dp){
          System.out.println(Arrays.toString(i));
          }
        */
        return max*max;
    }
}
