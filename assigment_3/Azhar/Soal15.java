
public class Soal15 {
	public static void main(String[] args) {
		int n = 9;
		int m = 3;
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			if (i % m == 0) {
				System.out.println();
			}
		}
	}
}
