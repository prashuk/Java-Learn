import java.util.*;

class sortStringContainNum {
    public static void main(String[] args) {

    List<String> strings = Arrays.asList("prashuk   11  11-11-1111", "prashuk   12  11-11-1111", "prashuk   10  11-11-1111", "prashuk   11  11-11-1111", "prashuk   9  11-11-1111");
    System.out.println(strings);
    Collections.sort(strings, new Comparator<String>() {
        public int compare(String o1, String o2) {
            return extractInt(o1) - extractInt(o2);
        }

        int extractInt(String s) {
            String num = s.replaceAll("\\s+[0-9-]*$", "");
            String num1 = num.replaceAll("^[a-z]*\\s+", "");
            // return 0 if no digits found
            System.out.println(num1);
            return num1.isEmpty() ? 0 : Integer.parseInt(num1);
        }
    });
    System.out.println(strings);
}
}