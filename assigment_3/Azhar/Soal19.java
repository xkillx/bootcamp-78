
public class Soal19 {
	public static void main(String[] args) {
		int n = 9;
		int angka = 1;
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= angka; j++) {
				if (j == 1 || j == angka || i == n) {
					System.out.print(i);
				}
				else {
					System.out.print(" ");
				}
			}
			
			angka += 2;
			
			System.out.println();
		}
	}
}
