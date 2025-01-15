public class ReverseInt {
    public static void main(String[] args) {
        int n = 12211;
        boolean reverse = getReverseNumber(n);
        System.out.println(reverse);
    }

    private static boolean getReverseNumber(int n) {
        int res = 0;
        int org = n;
        while (n > 0) {
            int last = n % 10;
            res = res * 10 + last;
            n = n / 10;
        }

        return org == res;
    }
}
