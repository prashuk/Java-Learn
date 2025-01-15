import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SubsetSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3));

        ArrayList<Integer> sums = new ArrayList<>();
        subsetSum(0, 0, arr, arr.size(), sums);
//        Collections.sort(sums, (a,b) -> b-a);
        Collections.sort(sums, new Desc());
        System.out.println(sums);
    }

    static class Desc implements Comparator<Object> {
        @Override
        public int compare(Object o1, Object o2) {
            return o2.hashCode()-o1.hashCode();
        }
    }

    public static void subsetSum(int idx, int sum, ArrayList<Integer> arr, int n, ArrayList<Integer> sums) {
        if (idx == n) {
            sums.add(sum);
            return;
        }

        subsetSum(idx+1, sum + arr.get(idx), arr, n, sums);
        subsetSum(idx+1, sum, arr, n, sums);
    }
}
