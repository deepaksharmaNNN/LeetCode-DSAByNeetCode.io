class Solution {
    private int maxValue(int rowStart, int colStart, int[][] grid){
        int max = -1;
        for(int i = rowStart; i <= rowStart + 2; i++){
            for(int j = colStart; j <= colStart + 2; j++){
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] res = new int[n - 2][n - 2];
        for(int i = 0; i < n - 2; i++){
            for(int j = 0; j < n - 2; j++){
                res[i][j] = maxValue(i, j, grid);
            }
        }
        return res;
    }
}