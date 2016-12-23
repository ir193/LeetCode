Title: Leetcode minimum-path-sum solution
Slug: minimum-path-sum
Date: 2016-09-27 22:28:27
Tags: LeetCode,
Category: LeetCode
Author: ir193


## Leetcode minimum-path-sum solution

A simple and naive DP:
The valuable part is the way to deal with boundary conditions.


```java
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
                        min[i][j] = min[i][j-1] + grid[i][j];   //i == 0
                    }
                    else{
                        min[i][j] = grid[i][j];                 //(0,0)
                    }
                }
                else if(j == 0){
                    min[i][j] = min[i-1][j] + grid[i][j];       //j == 0
                }
                else{
                    min[i][j] = Math.min(min[i-1][j], min[i][j-1])+grid[i][j];
                                                                //the naive DP
                }
            }
        }

        return min[m-1][n-1];
    }
}
```
