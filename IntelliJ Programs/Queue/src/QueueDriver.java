import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDriver {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < 10; i++) {
            q.add(i);
        }

        System.out.println(q.size());
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);

        System.out.println(q.remove());
        System.out.println(q);

        Iterator itr = q.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next());
        }
    }
}
