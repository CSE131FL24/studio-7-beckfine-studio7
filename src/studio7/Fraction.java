package studio7;

public class Fraction {
	
	private int nume;
	private int deno;
	
	public Fraction (int numerator, int denominator) {
		nume = numerator;
		deno = denominator;
	}
	
	public static String Addition (Fraction f1, Fraction f2 ) {
		 int denom = f1.deno * f2.deno;
		 int numer = (f1.nume*f2.deno) + (f2.nume*f1.deno);
		return numer +"/"+denom;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fraction ff1 = new Fraction(1,2);
		Fraction ff2 = new Fraction(2,3);
		
		System.out.println(Fraction.Addition(ff1, ff2));		
	}

}
