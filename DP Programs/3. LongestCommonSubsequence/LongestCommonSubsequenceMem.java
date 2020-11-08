// https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/

public class LongestCommonSubsequenceMem {
    public static int lcs(char[] x, char[] y, int m, int n) {
        int[][] mem = new int[m+1][n+1];

        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    mem[i][j] = 0;
                } else if (x[i-1] == y[j-1]) {
                    mem[i][j] = mem[i-1][j-1] + 1;
                } else {
                    mem[i][j] = Math.max(mem[i][j-1],mem[i-1][j]);
                }
            }
        }

        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                System.out.print(mem[i][j]);
            }
            System.out.println();
        }

        return mem[m][n];
    }
    
    public static void main(String[] args) {
        String x1 = "AGGTAB";
        String y1 = "GXTXAYB";

        char[] x = x1.toCharArray();
        char[] y = y1.toCharArray();

        int m = x.length;
        int n = y.length;

        int res = lcs(x, y, m, n);
        System.out.println(res);
    }
}