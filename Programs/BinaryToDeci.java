
import java.util.*;
import java.util.stream.IntStream;

class BinaryToDeci {
    public static void main(String[] args) {
        String s = "100";
        int no = Integer.parseInt(s);
        double ans = 0;
        int x = 0;
        while (no != 0) {
            int rem = no % 10;
            // print(rem);
            ans = ans + Math.pow(2, x) * rem;
            print(Math.pow(2, x));
            x++;
            no = no / 10;
        }
        print(ans);
    }

    private static void print(Object object) {
        System.out.println(object);
    }
}
