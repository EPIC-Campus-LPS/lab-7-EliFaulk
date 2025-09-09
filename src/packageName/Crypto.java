package packageName;

public class Crypto {
	
	public static String encrypt(String message, int shift) {
		String output = "";
		for (int i = 0; i < message.length(); i++) {
			char letter = message.charAt(i);
			int charValue = letter;
			if ((Character.isLetter(letter)) && (Character.isUpperCase(letter))) {
				charValue = (letter - 'A' + shift) % 26 + 'A';
			} else if (Character.isLetter(letter) && Character.isLowerCase(letter)) {
				charValue = (letter - 'a' + shift) % 26 + 'a';
			}
			letter = (char) charValue;
			output = output + letter;
		}
		return output;
	}
	
	public static String decrypt(String message, int shift) {
		String output = "";
		for (int i = 0; i < message.length(); i++) {
			char letter = message.charAt(i);
			int charValue = letter;
			if ((Character.isLetter(letter)) && (Character.isUpperCase(letter))) {
				charValue = (letter - 'A' - shift) % 26 + 'A';
			} else if (Character.isLetter(letter) && Character.isLowerCase(letter)) {
				charValue = (letter - 'a' - shift + 26) % 26 + 'a';
			}
			letter = (char) charValue;
			output = output + letter;
		}
		return output;
	}
}
