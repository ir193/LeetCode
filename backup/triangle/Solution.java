public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.toArray().length;
        int[] dp = new int[m];
        int[] dp_last = new int[m];
        int min=0;
        
        Iterator<List<Integer>> p = triangle.iterator();
        int j = 0;
        for(List<Integer> row : triangle){
        //while(p.hasNext()){
            //List<Integer> row = p.next();
            //Iterator<Integer> q = row.iterator();
            int i = 0;
            min = Integer.MAX_VALUE;
            for(int num : row){
            //while(q.hasNext()){
                //int num = q.next();
                if(i == 0){
                    dp[0] = dp_last[0] + num;
                }
                else if(i == j){
                    dp[i] = dp_last[i-1] + num;
                }
                else{
                    dp[i] = Math.min(dp_last[i-1], dp_last[i]) + num;
                }
               
                min = Math.min(min, dp[i]);
                i++;
            }
            //System.out.println(Arrays.toString(dp));
            dp_last = dp.clone();
            j++;
        }
        return min;
    }
}
