public class Divide {
    public static void main(String[] args) {
        int res = divide(31, 3);
        System.out.println(res);
    }

    private static int divide(int dividend, int divisor) {
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);

        int res = 0;

        while(a-b >= 0) {
            int x = 0; // 2^0
            while(a-(b<<1<<x) >= 0) {
                x++;
            }
            res += (1 << x);
            a -= b << x;
        }

        return res;
    }
}
