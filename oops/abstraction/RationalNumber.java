package oops;
import java.lang.ArithmeticException;

public class RationalNumber {
	
	private int numerator;
	private int denominator;
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public RationalNumber(int num, int den) {
		if(den==0) {
			throw new ArithmeticException("Divide By Zero");
		}
		int g = gcd(num,den);
		numerator = num/g;
		denominator = den/g;
		
		if(denominator <0) {
			denominator = -denominator;
			numerator = -numerator;
		}
	}
	
	public String toString() {
		if(denominator == 1)
			return numerator+"";
		else
			return numerator+"/"+denominator;
	}
	
	public int gcd(int a, int b) {
		if(a<0)
			a=-a;
		if(b<0)
			b=-b;
		
		if(0==b)
			return a;
		else
			return gcd(b, a%b);
	}
	
	public int lcm(int a, int b) {
		if(a<0)
			a=-a;
		if(b<0)
			b=-b;
		return a*(b/gcd(a,b));
	}
	
	public RationalNumber multiply(RationalNumber rational) {
		
		RationalNumber c = new RationalNumber(numerator, rational.denominator);
		RationalNumber d = new RationalNumber(rational.numerator, denominator);
		return new RationalNumber(c.numerator*d.numerator, c.denominator*d.denominator);
	}
	
	public RationalNumber add(RationalNumber rational) {
		
		int gcd1=gcd(numerator, rational.denominator);
		int gcd2=gcd(denominator, rational.numerator);
		
		RationalNumber res = new RationalNumber((numerator/gcd1)*(rational.denominator)+(rational.numerator/gcd1)*(denominator/gcd2), denominator*(rational.denominator/gcd2));
		res.numerator *=gcd1;
		return res;
	}
	
	public RationalNumber negate() {
		return new RationalNumber(-numerator, denominator);
	}
	
	public RationalNumber subtract(RationalNumber rational) {
		return add(rational.negate());
	}
	
	public RationalNumber reciprocal() {
		return new RationalNumber(denominator, numerator);
	}
	
	public RationalNumber dividedBy(RationalNumber rational) {
		return this.multiply(rational.reciprocal());
	}

}
