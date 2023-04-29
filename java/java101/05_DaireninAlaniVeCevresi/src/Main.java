import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * int r; double cevre, alan; double pi = 3.14;
		 * 
		 * Scanner input = new Scanner(System.in);
		 * System.out.print("Dairenin yarı çapını giriniz: "); r = input.nextInt();
		 * 
		 * cevre = 2 * pi * r; alan = pi * r * r;
		 * 
		 * System.out.println("Dairenin çevresi: " + cevre);
		 * System.out.println("Dairenin alanı: " + alan);
		 */
		
		int r, a;
		double pi = 3.14, alan;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Dairenin yarı çapını giriniz: ");
		r = input.nextInt();
		System.out.print("Dairenin merkez açısını giriniz: ");
		a = input.nextInt();
		
		alan = (pi * r * r * a) / 360;
		System.out.println("Dairenin alanı: " + alan);
		
	}

}
