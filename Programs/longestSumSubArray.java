import java.util.HashMap;

class longestSumSubArray {
    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        int max_so_far = Integer.MIN_VALUE;
        int max_end_here = 0;

        for(int i = 0; i < a.length; i++) {
            max_end_here = max_end_here + a[i];
            if(max_so_far < max_end_here) {
                max_so_far = max_end_here;
            }
            if (max_end_here < 0) {
                max_end_here = 0;
            }
        }
        
        HashMap<Integer, Integer> um = new HashMap<Integer, Integer>();  
        int sum = 0;
        int len = 0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i];

            if(sum == max_so_far) {
                len = i + 1;
            }

            if(!um.containsKey(sum)) {
                um.put(sum, i);
            }

            if (um.containsKey(sum - max_so_far)) 
		    { 
			    if (len < (i - um.get(sum - max_so_far))) 
			    	len = i - um.get(sum - max_so_far); 
		    }

        }
        System.out.println(len);
    }
}