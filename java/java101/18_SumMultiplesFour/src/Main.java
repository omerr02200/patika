import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		int n, sum = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Sayı giriniz: ");
			n = input.nextInt();
			
			if(n % 2 == 1) {
				sum += n;
			}
		}while(n > 0);
		
		System.out.println("Toplam : " + sum);
		*/
		
		int n, sum = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Sayı giriniz: ");
			n = input.nextInt();
			
			if(n % 4 == 0) {
				sum += n;
			}
		}while(n % 2 == 0);
		
		System.out.println("Toplam : " + sum);
	}
}