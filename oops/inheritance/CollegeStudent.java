package oops;

public class CollegeStudent extends Student {
	private double mark;
	
	public CollegeStudent(String name, int stCode, double mark) {
		super(name, stCode);
		this.mark = mark;
	}
	
	public double getMark() {
		return mark;
	}
	
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	public void generateMarksheet() {
		System.out.println("Semester Detail");
		System.out.println("Student Code: "+getStCode());
		System.out.println("For: "+getName());
		System.out.println("Marks: "+ getMark());
	}
}
