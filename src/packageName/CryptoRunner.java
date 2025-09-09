package packageName;

public class CryptoRunner {

	public static void main(String[] args) {
		
		String message = "Hello, how are you?";
		
		String encoded = Crypto.encrypt(message, 7);
		System.out.println(encoded);
		
		String decoded = Crypto.decrypt(encoded, 7);
		System.out.println(decoded);

	}

}
