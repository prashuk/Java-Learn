// https://www.geeksforgeeks.org/overlapping-subproblems-property-in-dynamic-programming-dp-1/
// https://www.geeksforgeeks.org/optimal-substructure-property-in-dynamic-programming-dp-2/

import java.util.Arrays;

public class DP1 {
    static int min = -1;
    static int max = 100;
    static int[] lookup = new int[max];

    public static int fib(int n) {
        if (lookup[n] == 0) {
            if (n <= 1) {
                lookup[n] = n;
            } else {
                lookup[n] = fib(n-1) + fib(n-2);
            }
        }
        System.out.println(Arrays.toString(lookup));
        return lookup[n];
    }
    public static void main(String[] args) {
        int n = 6;
        int res = fib(n);
        System.out.println(res);
    }
}