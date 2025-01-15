import java.util.ArrayList;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        String[] s1 = new String[] {"tea","tea","act"};
        String[] s2 = new String[] {"ate","toe","acts"};

        System.out.println(anagrams(s1, s2));
    }

    private static List<Integer> anagrams(String[] s1, String[] s2) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].length() != s2[i].length()) {
                res.add(-1);
                continue;
            }
            int[] x = toMap(s1[i]), y = toMap(s2[i]);
            int val1 = 0, val2 = 0;
            for (int j = 0; j < 26; j++) {
                if (x[j] >= y[j]) {
                    val1 += x[j] - y[j];
                } else {
                    val2 += y[j] - x[j];
                }
            }
            res.add(Math.min(val1, val2));
        }
        return res;
    }

    private static int[] toMap(String s) {
        char[] ch = s.toCharArray();
        int[] res = new int[26];
        for (char c : ch) {
            res[c - 'a']++;
        }

        return res;
    }
}
