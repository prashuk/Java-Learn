import java.util.PriorityQueue;

public class PriorityQue {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i = 10; i > 0; i--) {
            q.add(i);
        }

        System.out.println(q.size());
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);

        System.out.println(q.remove(20));
        System.out.println(q.contains(15));

        Object[] arr = q.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
