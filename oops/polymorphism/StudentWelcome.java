package oops;

public class StudentWelcome extends Base{
	
	public StudentWelcome(String name) {
		super(name);
	}
	
	public void generateWelcome() {
		System.out.println("Hello Student!");
	}
}
