/**
 * SplitJava
 */
public class SplitJava {

	public static void main(String[] args) {
		String s = "asd/ jk/  @.#$.%^&*(). ,a/sd.ads";
		String[] ss = s.split("\\.");
		for (String i : ss) {
			System.out.println(i);
		}
	}
}

// for any special character use \\{char_name}