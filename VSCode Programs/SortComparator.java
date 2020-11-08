import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

class SortComparator {
    public static void main(String[] args) {
        java.util.List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(400);
        list.add(300);
        list.add(900);
        
        Comparator<Integer> com = new comClass();
        Collections.sort(list, com);
        Collections.sort(list, Comparator);
        System.out.println(list);
    }

    class comClass implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            if(o1 > o2) {
                return 1;
            }
            return 0;
        }
    }
}

