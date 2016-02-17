public class Soal20 {
	public static void main(String[] args) {
		int n = 9;
		int angka = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= angka; j++) {
				System.out.print("*");
			}

			angka += 2;

			System.out.println();
		}
		
		angka -= 4;
		
		for (int i = 1; i <= n - 1; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= angka; j++) {
				System.out.print("*");
			}
			
			angka -= 2;
			
			System.out.println();
		}
	}
}
