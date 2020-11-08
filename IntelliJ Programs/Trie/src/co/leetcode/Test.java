package co.leetcode;

public class Test {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,2147483647};
        System.out.println(containsNearbyAlmostDuplicate(nums, 1, 2147483647));
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (Math.abs(i - j) <= k) {
                    if(Math.abs(nums[i] - nums[j]) <= t) {
                        if (Math.abs(nums[i] - nums[j]) < 0) {
                            System.out.println(-1 * Math.abs(nums[i] - nums[j]));
                            if(Math.abs(nums[i] - nums[j]) * -1 > t) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
