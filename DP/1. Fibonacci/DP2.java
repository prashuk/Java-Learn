// https://www.geeksforgeeks.org/overlapping-subproblems-property-in-dynamic-programming-dp-1/
// https://www.geeksforgeeks.org/optimal-substructure-property-in-dynamic-programming-dp-2/

public class DP2 {
    public static int fib(int n) {
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i < n+1; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        int n = 9;
        int res = fib(n);
        System.out.println(res);
    }
}