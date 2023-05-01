import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Sayı giriniz: ");
		int k = inp.nextInt();
		int sum = 0, count = 0;

		for (int i = 1; i <= k; i++) {
			if (i % 12 == 0) {
				System.out.println(i);
				sum += i;
				count++;
			}
		}

		double average = sum / count;
		System.out.println("Girdiğiniz sayıya kadar olan, 3 ve 4 e bölünen sayıların ortalaması: " + average);
	}

}
