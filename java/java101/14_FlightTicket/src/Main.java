import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int km, age, travelType = 0;
		double sum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mesafeyi km türünden giriniz: ");
		km = input.nextInt();
		
		System.out.print("yaşınızı giriniz: ");
		age = input.nextInt();
		
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
		travelType = input.nextInt();
		
		sum = km * 0.1;
		
		if(km<0 || age<0 || travelType < 1 || travelType > 2) {
			System.out.println("Hatalı veri girdiniz!");
		}else {
			if(age < 12) {
				sum *= 0.5;
			}else if(age >= 12 && age < 24) {
				sum *= 0.9;
			}else if (age > 65) {
				sum *= 0.7;
			}
			
			if(travelType == 2) {
				sum *= (0.8 * 2);
			}
			
			System.out.println("Toplam tutar = " + sum);
		}
	}

}
