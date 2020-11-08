public class NumberOfIsland {
    public static void main(String[] args) {
        char[][] grid = new char[][] {  {'1','1','1','1','0'},
                                        {'1','1','0','1','0'},
                                        {'1','1','0','0','0'},
                                        {'0','0','0','0','1'} };
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    dfs(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfs(int i, int j, char[][] grid) {
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j]=='0')
            return;

        grid[i][j] = '0';
        int[] x = new int[] {1,-1,0,0};
        int[] y = new int[] {0,0,-1,1};

        for(int k = 0; k < x.length; k++) {
            dfs(i+x[k], j+y[k], grid);
        }
    }
}
