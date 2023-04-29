import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int mat, fizik, kimya, turkce, muzik, sayac = 0;
		double average;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunuz: ");
		mat = input.nextInt();
		if(mat < 0 || mat > 100) {
			mat = 0;
		}else {
			sayac++;
		}
		
		System.out.print("Fizik notunuz: ");
		fizik = input.nextInt();
		if(fizik < 0 || fizik > 100) {
			fizik = 0;
		}else {
			sayac++;
		}
		
		System.out.print("Kimya notunuz: ");
		kimya = input.nextInt();
		if(kimya < 0 || kimya > 100) {
			kimya = 0;
		}else {
			sayac++;
		}
		
		System.out.print("Türkçe notunuz: ");
		turkce = input.nextInt();
		if(turkce < 0 || turkce > 100) {
			turkce = 0;
		}else {
			sayac++;
		}
		
		System.out.print("Müzik notunuz: ");
		muzik = input.nextInt();
		if(muzik < 0 || muzik > 100) {
			muzik = 0;
		}else {
			sayac++;
		}
		
		average = (mat + fizik + kimya + turkce + muzik) / sayac;
		
		if(average >= 55) { 
			System.out.println("Geçtiniz");
		}else {
			System.out.println("Kaldınız");
		}
		
		System.out.println("Not ortalamanız: " + average);
	}

}
