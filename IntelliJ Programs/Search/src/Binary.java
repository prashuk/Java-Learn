public class Binary {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6,7,8,9};
        int t = 0;
        System.out.println(binarySearch(nums, 0, nums.length-1, t));
    }

    public static boolean binarySearch(int[] nums, int start, int end, int t) {
        if(end >= start) {
            int mid = start + (end-start) / 2;
            if (nums[mid] == t) {
                return true;
            }

            if (nums[mid] > t) {
                return binarySearch(nums, start, mid-1, t);
            } else {
                return binarySearch(nums, mid+1, end, t);
            }
        }
        return false;
    }
}
