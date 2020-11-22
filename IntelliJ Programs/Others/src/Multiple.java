public class Multiple {
    public static void main(String[] args) {
        int res = multiply(31, 3);
        System.out.println(res);
    }

    private static int multiply(int a, int b) {
        int x = Math.abs(a);
        int y = Math.abs(b);

        int res = 0;

        while(x >= 1) {
            int pow = 0; // 2^0
            while(a-(b<<1<<x) >= 0) {
                x++;
            }
            res += (1 << x);
            a -= b << x;
        }

        return res;
    }
}
