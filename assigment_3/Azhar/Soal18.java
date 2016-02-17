
public class Soal18 {
	public static void main(String[] args) {
		int n = 5;
		int angka = 1;
		
		for (int i = 1; i <= n; i++) {
			
			if (i == 2) {
				angka = 2;
			}
			
			for (int j = 1; j <= i; j++) {
				
				if (j == 1 || j == i) {
					System.out.print("1");
				}
				else {
					System.out.print(angka);
				}
			}
			
			angka += 2;
			System.out.println();
		}
	}
}
