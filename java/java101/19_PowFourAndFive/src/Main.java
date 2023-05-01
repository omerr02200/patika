import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n;
		Scanner input = new Scanner(System.in);
		
		/*
		System.out.print("Merhaba, gireceğiniz sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıralım. Sınır sayısı: ");
		n = input.nextInt();
		
		for(int i = 1; i <= n; i *= 2) {
			System.out.println(i);
		}
		*/
		
		System.out.print("Merhaba, gireceğiniz sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıralım. Sınır sayısı: ");
		n = input.nextInt();
		
		for(int i = 1; i <= n; i *= 4) {
			System.out.println(i);
		}
		
		for(int i = 1; i <= n; i *= 5) {
			System.out.println(i);
		}
	}

}
