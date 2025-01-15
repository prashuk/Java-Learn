import java.util.*;

public class NMeeting {

    static class meeting {
        int s, e, p;

        meeting(int s, int e, int p) {
            this.s = s;
            this.e = e;
            this.p = p;
        }
    }

    static class mtComparator implements Comparator<meeting> {
        @Override
        public int compare(meeting o1, meeting o2) {
            if (o1.e < o2.e) return -1;
            if (o1.e > o2.e) return 1;
            if (o1.p < o2.p) return -1;
            return 1;
        }
    }

    public static void main(String[] args) {
        maxMeeting(new int[]{1,3,0,5,8,5}, new int[]{2,4,6,7,9,9,}, 6);
    }

    public static void maxMeeting(int[] start, int[] end, int n) {
        ArrayList<meeting> meet = new ArrayList<>();
        for(int i = 0; i < n; i++)
            meet.add(new meeting(start[i], end[i], i+1)); // n

        Collections.sort(meet, new mtComparator()); // nlgn

        ArrayList<Integer> res = new ArrayList<>();
        res.add(meet.get(0).p);

        for(int i = 1; i < n; i++) {
            if(meet.get(i).s > meet.get(i-1).e) {
                res.add(meet.get(i).p); // n
            }
        }

        System.out.println(res);
    }
}