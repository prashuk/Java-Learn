import java.util.Map;
import java.util.Stack;
import java.util.HashMap;

class validParan {
    public static void main(String[] args) {
        String s = ")(";
        Map<Character,Character> mp = new HashMap<>();
        mp.put('(',')');
        mp.put('{','}');
        mp.put('[',']');
        Stack st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(mp.keySet().contains(s.charAt(i))) {
                st.push(s.charAt(i));
            } else if (mp.values().contains(s.charAt(i))) {
                if(!st.empty() && mp.get(st.peek()) == s.charAt(i)) {
                    st.pop();
                } else {
                    System.out.println("false");
                }
            }
        }
        System.out.println(st.empty());
    }
}