import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int heat;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sıcaklık giriniz: ");
		heat = input.nextInt();
		
//		if(heat<5) {
//			System.out.println("Kayak yapabilrsiniz");
//		}else if(heat<=25) {
//			if(heat<=15) {
//				System.out.println("Sinemaya gidebilrsiniz");
//			}
//			if(heat>=10) {
//				System.out.println("Pikniğe gidebilrsiniz");
//			}
//		}else {
//			System.out.println("Yüzmeye gidebilrsiniz");
//		}
		
		if (heat > 25) {
			System.out.println("Yüzmeye gidebilrsiniz");
		} else if (heat <= 25 && heat >= 15) {
			System.out.println("Pikniğe gidebilrsiniz");
		}
		if (heat <= 15 && heat >= 5) {
			System.out.println("Sinemaya gidebilrsiniz");
		} else if (heat < 5) {
			System.out.println("Kayak yapabilrsiniz");
		}
	}

}
