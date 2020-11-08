import java.util.*;

public class DequeDriver {
    public static void main(String[] args)
    {
        Deque<String> dq = new ArrayDeque<String>();

        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");

        dq.poll();
        dq.pollFirst();
        dq.pollLast();

        dq.clear();
        dq.size();
        dq.contains("Geeks");

        Iterator itr = dq.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(dq);
    }
}
