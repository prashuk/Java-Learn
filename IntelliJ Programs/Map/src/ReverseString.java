public class ReverseString {
    public static void main(String[] args) {
        String str = "abba";
        boolean reverse = getReverseString(str);
        System.out.println(reverse);
    }

    private static boolean getReverseString(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length/2; i++) {
            char temp = ch[i];
            int last = str.length() - i - 1;
            ch[i] = ch[last];
            ch[last] = temp;
        }

        return str.equals(String.valueOf(ch));
    }
}
