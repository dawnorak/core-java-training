package oops;

public class RationalApp {

	public static void main(String[] args) {
		
		RationalNumber x,y,z;
		
		x = new RationalNumber(2,4);
		y = new RationalNumber(3,9);
		
		z = x.add(y);
		System.out.println(z);
		
		z = x.subtract(y);
		System.out.println(z);
		
		z = x.multiply(y);
		System.out.println(z);
		
		z = x.dividedBy(y);
		System.out.println(z);

	}
}
