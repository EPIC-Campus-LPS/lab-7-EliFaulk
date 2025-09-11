package packageName;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class part3 {

	public static void main(String[] args) throws IOException {
		File emails = new File("emails.txt");
		Scanner scanner = new Scanner(emails);
		
		while (scanner.hasNext()) {
			String email = scanner.next();
			String[] parts = email.split("@");
			int passwordLength = (int)(Math.random() * 15);
			String password = "";
			for (int i = 0; i < passwordLength; i++) {
				boolean isNumber = Math.random() > 0.75;
				char next;
				if (isNumber) {
					next = (char) ((Math.random() * 10) + '0');
				} else {
					next = (char) ((Math.random() * 26) + 'a');
				}
				password = password + next;
			}
			System.out.println(parts[0] + ", " + password);
		}
		
		scanner.close();

	}

}
