public class Solution {
    public int minPathSum(int[][] grid) {
        //ArrayList<ArrayList<Integer>> min = new ArrayList<>();
        int m = grid.length;
        if(m == 0){
            return 0;
        }
        int n = grid[0].length;
        if(n == 0){
            return 0;
        }
        int[][] min = new int[m][n];

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(i == 0){
                    if(j != 0){
                        min[i][j] = min[i][j-1] + grid[i][j];
                    }
                    else{
                        min[i][j] = grid[i][j];
                    }
                }
                else if(j == 0){
                    min[i][j] = min[i-1][j] + grid[i][j];
                }
                else{
                    min[i][j] = Math.min(min[i-1][j], min[i][j-1])+grid[i][j];
                }
            }
        }

        return min[m-1][n-1];
    }
}
