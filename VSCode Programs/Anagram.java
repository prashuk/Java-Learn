import java.util.Map;
import java.util.Stack;
import java.util.HashMap;

class Anagram {
    public static void main(String[] args) {
        String s = "ad";
        String t = "ad";
        int flag = 0;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int x : arr) {
            if (x != 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("not valid");
        } else {
            System.out.println("valid");
        }
    }
}