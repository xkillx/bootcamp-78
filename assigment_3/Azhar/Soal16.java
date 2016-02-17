
public class Soal16 {
	public static void main(String[] args) {
		int n = 9;
		int angka = 1;
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= angka; j++) {
				System.out.print("*");
			}
			
			angka += 2;
			
			System.out.println();
		}
	}
}
