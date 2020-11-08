import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
    }
}
