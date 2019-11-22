import java.util.*;
import java.util.stream.IntStream;

class pairNum {	
	public static void main(String[] args) {

		int[] a = {-1,-2,-3,-4,-5,1,2,3,4,5,6};
		int k = 1;
		List<Integer> list = new ArrayList<>();
		ArrayList<String> listString = new ArrayList<String>();
		listString.add("Prashuk");
		listString.add("e");

		for(int x : a) {
			list.add(x);
		}
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			int d = (int)itr.next();
			System.out.println(d);
		}

		System.out.println(list);
		list.remove(new Integer(-1));
		System.out.println(list);

		System.out.println(listString);
		listString.remove("e");
		System.out.println(listString);

		// for(int x : a) {
		// 	if(list.contains(k-x)) {
		// 		int l = x;
		// 		int m = k-x;
		// 		System.out.println(Integer.toString(l) + ", " + Integer.toString(m));
		// 		list.remove((int)(x));
		// 		list.remove(new Integer(k-x));
		// 	}
		// }
		
		// Arrays.sort(a);
		// for(int x : a) System.out.println(x);
		
		// int[] b = new int[5];
		// for(int i = 6; i <= 10; i++) {
		// 	b[i-6] = i;
		// }

		// for(int x : a) {
		// 	print(Integer.toString(x));
		// }

		// for(int y : b) print(Integer.toString(y));

		// for(int i = 0; i < a.length; i++) {
		// 	for(int j = i+1; j < a.length; j++) {
		// 		if(a[i] + a[j] == 0) {
		// 			System.out.println(a[i] + "," + a[j]);
		// 		}
		// 	}
		// }
	}

	private static void print(Object str) {
		System.out.println(str);
	}
}
