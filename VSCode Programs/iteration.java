import java.util.*;
import java.util.stream.IntStream;

class iteration {	
	public static void main(String[] args) {

		List<Integer> lI = new ArrayList<Integer>();
		List<String> lS = new ArrayList<String>();
		Map<Integer, String> mIS = new HashMap<Integer, String>();
		Map<String, Integer> mSI = new HashMap<String, Integer>();
		Map<Integer, Integer> mII = new HashMap<Integer, Integer>();
		Map<String, String> mSS = new HashMap<String, String>();

		lI.add(1); lI.add(2); lI.add(3); lI.add(4); lI.add(5);
		// Iterator itr = lI.iterator();
		// while (itr.hasNext()) print(itr.next());
		// or
		// for(int i = 0; i < lI.size(); i++) {
		// 	print(lI.get(i));
		// }
		// lI.remove(new Integer(2));
		// lI.remove(2);
		// Collections.sort(lI);

		lS.add("a"); lS.add("b"); lS.add("c"); lS.add("d"); lS.add("e");
		// print(lS);
		// Iterator itr = lI.iterator();
		// while (itr.hasNext()) print(itr.next());
		// for(int i = 0; i < lS.size(); i++) {
		// 	print(lS.get(i));
		// }
		// lS.remove("b");
		// lS.remove(2);
		// Collections.sort(lS);

		mIS.put(1, "a"); mIS.put(2, "b"); mIS.put(3, "c"); mIS.put(4, "d"); mIS.put(5, "e"); 
		// for(Map.Entry<Integer, String> item : mIS.entrySet()) {
		// 	print(item.getKey() + ", " + item.getValue());
		// }
		// mIS.remove(1);
		print(mIS.containsKey(9));
		print(mIS.containsValue("a"));

		mSI.put("a", 1); mSI.put("b", 2); mSI.put("c", 3); mSI.put("d", 4); mSI.put("e", 5);
		// for(Map.Entry<String, Integer> item : mSI.entrySet()) {
		// 	print(item.getKey() + ", " + item.getValue());
		// }
		// mSI.remove("a");

		mII.put(1, 1); mII.put(2, 2); mII.put(3, 3); mII.put(4, 4); mII.put(5, 5);
		// for(Map.Entry<Integer, Integer> item : mII.entrySet()) {
		// 	print(item.getKey() + ", " + item.getValue());
		// }
		// mII.remove(1);
		// print(mII);

		mSS.put("a", "a"); mSS.put("b", "b"); mSS.put("c", "c"); mSS.put("d", "d"); mSS.put("e", "e");
		// print(mSS);
		// for(Map.Entry<String, String> item : mSS.entrySet()) {
		// 	print(item.getKey() + ", " + item.getValue());
		// }
		// mSS.remove("a");

	}

	private static void print(Object object) {
		System.out.println(object);
	}
}
