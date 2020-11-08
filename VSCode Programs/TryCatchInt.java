import java.util.*;
import java.util.stream.IntStream;

class TryCatchInt {
	public static void main(String[] args) {

		String a = "1a";
		try {
			int x = Integer.parseInt(a);
			if (x == (int) x) {
				print(x);
			} else {
				print("No Number");
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

	private static void print(Object object) {
		System.out.println(object);
	}
}
