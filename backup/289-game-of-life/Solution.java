public class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = 0;
        if(m != 0){
            n = board[0].length;
        }

        for(int i=0; i < m; i++){
            for(int j=0; j < n; j++){
                if(board[i][j] % 2== 1){
                    int[] dx = new int[]{-1, 0, 1,-1,1,-1,0,1};
                    int[] dy = new int[]{-1,-1,-1, 0,0, 1,1,1};
                    for(int k=0; k<8; k++){
                        int di = dx[k];
                        int dj = dy[k];
                        if( (i + di >=0 && i + di < m) && (j + dj >=0 && j + dj < n)){
                            board[i+di][j+dj] += 2;
                        }
                    }
                }

            }
        }

        for(int i=0; i < m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] >= 5 && board[i][j] <= 7){
                    board[i][j] = 1;
                }
                else{
                    board[i][j] = 0;
                }
            }
        }


    }
}
