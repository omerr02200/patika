import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int birthyear;
		String burc = "";
		Scanner input = new Scanner(System.in);
		
		System.out.print("Doğum yılını giriniz: ");
		birthyear = input.nextInt();
		
		double remainder = birthyear % 12;
		
		if(remainder == 0) {
			burc = "Maymun";
		}else if(remainder == 1) {
			burc = "Horoz";
		}else if(remainder == 2) {
			burc = "Köpek";
		}else if(remainder == 3) {
			burc = "Domuz";
		}else if(remainder == 4) {
			burc = "Fare";
		}else if(remainder == 5) {
			burc = "Öküz";
		}else if(remainder == 6) {
			burc = "Kaplan";
		}else if(remainder == 7) {
			burc = "Tavşan";
		}else if(remainder == 8) {
			burc = "Ejderha";
		}else if(remainder == 9) {
			burc = "Yılan";
		}else if(remainder == 10) {
			burc = "At";
		}else if(remainder == 11) {
			burc = "Koyun";
		}
		
		System.out.println("Çin Zodyağı Burcunuz: " + burc);
			
	}

}
