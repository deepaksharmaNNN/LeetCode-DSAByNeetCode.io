class Solution {
    public void dfs(int row, int col, int[][] grid, int[][] vis, int[] delRow, int[] delCol){
        vis[row][col] = 1;
        int n = grid.length;
        int m = grid[0].length;
        for(int i =0;i<4;i++){
            int newRow = row + delRow[i];
            int newCol = col + delCol[i];
            if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && 
            vis[newRow][newCol] == 0 && grid[newRow][newCol] == 1){
                dfs(newRow,newCol,grid,vis,delRow,delCol);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] delRow = {-1,0,+1,0};
        int[] delCol = {0,1,0,-1};
        int[][] vis = new int[n][m];
        for(int j = 0;j<m;j++){
            if(vis[0][j] == 0 && grid[0][j] == 1){
                dfs(0,j,grid,vis,delRow,delCol);
            }
            if(vis[n-1][j] == 0 && grid[n-1][j] == 1){
                dfs(n-1,j,grid,vis,delRow,delCol);
            }
        }
        for(int i = 0;i<n;i++){
            if(vis[i][0] == 0 && grid[i][0] == 1){
                dfs(i,0,grid,vis,delRow,delCol);
            }
            if(vis[i][m-1] == 0 && grid[i][m-1] == 1){
                dfs(i,m-1,grid,vis,delRow,delCol);
            }
        }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j] == 0 && grid[i][j] == 1)
                    count++;
            }
        }
        return count;
    }
}