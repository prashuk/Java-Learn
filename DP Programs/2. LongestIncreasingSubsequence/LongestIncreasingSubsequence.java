// https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/

public class LongestIncreasingSubsequence {
    public static int lis(int[] arr) {
        int[] mem = new int[arr.length];

        for(int i = 0; i < mem.length; i++)
            mem[i] = 1;

        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && mem[i] < mem[j] + 1) {
                    mem[i] = mem[j] + 1;
                }
            }
        }
        int max = 0;
        for(int i = 0; i < mem.length; i++) {
            if (mem[i] > max)
                max = mem[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int res = lis(arr);
        System.out.println(res);
    }
}