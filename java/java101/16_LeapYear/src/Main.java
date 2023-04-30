import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int year;
		double leap;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Yıl Giriniz: ");
		year = input.nextInt();
		
		leap = year % 4;
		
		if((year % 100) == 0) {
			leap = year % 400;
		}
		
		if(leap == 0) {
			System.out.println(year + " yılı artık bir yıldır.");
		}else {
			System.out.println(year + " yılı artık bir yıl değildir.");
		}
	}

}
