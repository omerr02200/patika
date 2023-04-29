import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String userName, password="", newPassword;
		int select = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Kullanıcı adınız: ");
		userName = input.nextLine();
		
		if (userName.equals("patika")) {
			System.out.print("Şifreniz: ");
			password = input.nextLine();
			if (password.equals("java123")) {
				System.out.println("Giriş yaptınız");
			} else {
				System.out.print("Şifreniz yanlış. Sıfırlamak için 1 tuşuna basınız: ");
				select = input.nextInt();
			}
		}else {
			System.out.println("Kullancı adı yanlış");
		}

		if (select == 1) {
			System.out.print("Yeni şifreniz: ");
			Scanner input2 = new Scanner(System.in);
			newPassword = input2.nextLine();
			if (newPassword.equals(password) || newPassword.equals("java123")) {
				System.out.print("Yeni şifreniz hatalı girdiğiniz şifreden ve eski şifreden farklı olmalıdır");
			}else {
				System.out.print("Şifreniz Sıfırlandı."); 
			}
		}
		
	}

}
