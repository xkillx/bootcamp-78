
public class Soal17 {
	public static void main(String[] args) {
		int n = 9;
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
