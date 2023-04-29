import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		/*
		 * //değerleri oluşturalım int a,b; double c;
		 * 
		 * //Kullanıcıdan verilerimizi alalım Scanner input = new Scanner(System.in);
		 * System.out.print("1.Kenarı giriniz: "); a=input.nextInt();
		 * System.out.print("2.Kenarı giriniz: "); b=input.nextInt();
		 * 
		 * c = Math.sqrt((a*a) + (b*b)); System.out.print("Hipotenüs: " + c);
		 */
		
		//değerleri oluşturalım
		int a,b,c;
		double yariCevre, alan;
				
		//Kullanıcıdan verilerimizi alalım
		Scanner input = new Scanner(System.in);
		System.out.print("1.Kenarı giriniz: ");
		a = input.nextInt();
		System.out.print("2.Kenarı giriniz: ");
		b = input.nextInt();
		System.out.print("3.Kenarı giriniz: ");
		c = input.nextInt();
		
		yariCevre = (a + b + c) / 2;
		
		alan = Math.sqrt((yariCevre * (yariCevre - a) * (yariCevre - b) * (yariCevre - c)));
		System.out.print("Üçgenin alanı: " + alan);
	}

}