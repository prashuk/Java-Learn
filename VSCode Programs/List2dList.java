import java.util.*;

/**
 * List2dList
 */
public class List2dList {

	public static void main(String[] args) {
		List<String> oneDim = new ArrayList<>();
		List<List<String>> twoDim = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				oneDim.add("Prashuk" + i + j);
			}
			twoDim.add(oneDim);
			oneDim = new ArrayList<String>();
		}

		System.out.println(oneDim);
		System.out.println(twoDim);
		System.out.println(twoDim.get(1).get(1)); // Prashuk11

	}
}