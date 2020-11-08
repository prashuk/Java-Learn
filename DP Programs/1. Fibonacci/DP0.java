// https://www.geeksforgeeks.org/overlapping-subproblems-property-in-dynamic-programming-dp-1/
// https://www.geeksforgeeks.org/optimal-substructure-property-in-dynamic-programming-dp-2/

public class DP0 {
    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n = 9;
        int res = fib(n);
        System.out.println(res);
    }
}