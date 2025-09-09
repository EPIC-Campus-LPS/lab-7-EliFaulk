package packageName;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	
	public Fraction(int n) {
		numerator = n;
		denominator = 1;
	}
	
	public Fraction() {
		numerator = 0;
		denominator = 1;
	}
	
	
	public double toDecimal() {
		return (double) numerator / denominator;
	}
	
	public Fraction simplify() {
		int gcf = denominator;
		while (true) {
			int remainder = numerator % gcf;
			if (remainder == 0) {
				break;
			} else {
				
			}
		}
	}
}
