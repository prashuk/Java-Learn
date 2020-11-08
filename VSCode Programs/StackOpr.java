import java.util.*;

class StackOpr {
	public static void main(String[] args) {
		// Queue<Integer> st = new LinkedList<Integer>();
		// st.add(1);
		// st.add(5);
		// st.add(2);
		// st.add(10);
		// st.add(7);
		// System.out.println(st.remove()) ;
		// Iterator it = st.iterator();
		// while(it.hasNext()) {
		// 	System.out.println(it.next());
		// }

		PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
		queue.offer(4);
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);

		Integer val = null;
		while( (val = queue.poll()) != null) {
			System.out.println(val);
		}
	}
}