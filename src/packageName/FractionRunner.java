package packageName;

public class FractionRunner {

	public static void main(String[] args) {
		Fraction f = new Fraction(10,400);
		
		System.out.println(f);
		
		double d = f.toDecimal();
		System.out.println(d);
		
		Fraction f2 = f.simplify();
		System.out.println(f2);
		
		System.out.println(f.equals(f2));

	}

}
