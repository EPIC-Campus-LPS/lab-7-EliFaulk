package packageName;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	//Constructors
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
	
	
	//Methods
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
				gcf = remainder;
			}
		}
		return new Fraction(numerator/gcf, denominator/gcf);
	}
	
	
	@Override
	public String toString() {
		return numerator + "/" + denominator; 
	}
	
	public boolean equals(Object obj) {
		return ((double)numerator / denominator) == ((double)((Fraction) obj).getNumerator() / ((Fraction) obj).getDenominator());
	}
	
	
	//Getters
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
}
