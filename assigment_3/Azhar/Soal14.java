
public class Soal14 {
	public static void main(String[] args) {
		int n = 9;
		
		for (int i = n; i >= 1; i--) {
			int angka = 1;
			
			for (int j = 1; j <= i; j++) {
				System.out.print(angka + " ");
				angka += 2;
			}
			
			System.out.println();
		}
		
		for (int i = 2; i <= n; i++) {
			int angka = 1;
			
			for (int j = 1; j <= i; j++) {
				System.out.print(angka + " ");
				angka += 2;
			}
			
			System.out.println();
		}
		
	}
}
