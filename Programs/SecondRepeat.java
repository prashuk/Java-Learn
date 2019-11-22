import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.synth.SynthEditorPaneUI;

class SecondRepeat {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,2,2,2,3,3};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE-1;
        int s = -1;
        int s2 = -1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                int y = map.get(arr[i]);
                y++;
                map.put(arr[i], y);
            } else {
                map.put(arr[i], 1);
            }
            
        }
        for(Map.Entry<Integer,Integer> item : map.entrySet()) {
            if(item.getValue() > max) {
                max2 = max;
                max = item.getValue();
                s = item.getKey();
            }
        }
        System.out.println(map);
        System.out.println(max2);
    }
}