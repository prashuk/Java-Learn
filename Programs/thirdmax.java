class thirdmax {
    public int maximumProduct(int[] a) {
        int one = Integer.MIN_VALUE;
        int two = Integer.MIN_VALUE;
        int three = Integer.MIN_VALUE;
        int onemin = Integer.MAX_VALUE;
        int twomin = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++) {
            if(a[i] <= onemin) {
                twomin = onemin;
                onemin = a[i];
            } else if(a[i] <= twomin){
                twomin = a[i];
            }
            if (a[i] >= one) {
                three = two;
                two = one;
                one = a[i];
            } else if (a[i] >= two) {
                three = two;
                two = a[i];
            } else if (a[i] >= three) {
                three = a[i];
            }
        }
        return Math.max(one*two*three, one*onemin*twomin);
    }
}