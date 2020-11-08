// https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/

public class LongestCommonSubsequence {
    public static int lcs(char[] x, char[] y, int m, int n) {
        if (m == 0 || n == 0)
            return 0;
        
        if (x[m - 1] == y[n - 1])
            return 1+lcs(x,y,m-1,n-1);
        else
            return Math.max(lcs(x, y, m-1, n), lcs(x, y, m, n-1));
    }

    public static void main(String[] args) {
        String x1 = "AGGTAB";
        String y1 = "GXTXAYB";

        char[] x = x1.toCharArray();
        char[] y = y1.toCharArray();

        int xlen = x.length;
        int ylen = y.length;

        int res = lcs(x, y, xlen, ylen);
        System.out.println(res);
    }
}