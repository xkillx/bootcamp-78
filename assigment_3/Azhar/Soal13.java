
public class Soal13 {
	public static void main(String[] args) {
		int n = 5;
		
		for (int i = 1; i <= n; i++) {
			
			int angka = i;
			
			for (int j = 1; j <= i; j++) {
				System.out.print(angka);
				angka++;
			}
			
			angka -= 2;
			
			for (int j = angka; j >= i; j--) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}
