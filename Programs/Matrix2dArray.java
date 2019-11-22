/**
 * mat
 */
public class Matrix2dArray {

	public static void main(String[] args) {
		int[][] mat = { { 1, 2 }, { 3, 4 } }; // 5 rows, 7 columns
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(Integer.toString(i));
				System.out.print(Integer.toString(j));
				System.out.print("(" + mat[i][j] + ")");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}