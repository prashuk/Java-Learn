import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
class intersection {
    public static void main (String[] args) {
        int[] a1 = {1,2,3,4,4,4,5,5};
        int[] a2 = {4,4,5,5,5,6,7,8,9};
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < a1.length; i++) {
            if(map.containsKey(a1[i])) {
                int y = map.get(a1[i]);
                y++;
                map.put(a1[i], y);
            } else {
                map.put(a1[i], 1);
            }
        }
        for(int i = 0; i < a2.length; i++) {
            if(map2.containsKey(a2[i])) {
                int y = map2.get(a2[i]);
                y++;
                map2.put(a2[i], y);
            } else {
                map2.put(a2[i], 1);
            }
        }
        System.out.print(map);
        System.out.print(map2);
        for(Map<K,V>.Entry<Integer, Integer> item : map.entrySet()) {
            int key = item.getKey();
            int value = item.getValue();

            if(map2.containsKey(key) && map.get(key) != 0 && map2.get(key) != 0) {
                ans.add(key);
                map.put(key, value-1);
                map2.put(key, value-1);
            }
        }
        System.out.print(ans);
    }
}