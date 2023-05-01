import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, r, nFac = 1, rFac = 1, minusFac = 1, total;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kombinasyonu öğrenilmek istenen sayı: ");
		n = input.nextInt();
		
		System.out.print("Kaçlı Kombinasyonu alınacak: ");
		r = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			nFac *= i;
		}
		
		for(int i = 1; i <= r; i++) {
			rFac *= i;
		}
		
		int minus = n - r;
		
		for(int i = 1; i <= minus; i++) {
			minusFac *= i;
		}
		
		total = nFac / (rFac * (minusFac));
		
		System.out.println(n + "'in " + r + "'li " + "kombinasyonu: " + total);
	}

}
