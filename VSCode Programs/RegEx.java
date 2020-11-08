import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegEx {
	public static void main(String[] args) {
		String s = "cat cat cat prashuk 1 cat";
		String regex = "\\d";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		int count = 0;

		while(m.find()) {
			count++;
			System.out.println("Match number " + count);
         	System.out.println("start(): " + m.start());
         	System.out.println("end(): " + m.end());
		}
	}
}