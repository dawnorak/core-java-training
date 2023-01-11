package oops;

public class Sttudent {
	private String name;
	private int stCode;
	
	public Student(String name, int stCode) {
		this.name = name;
		this.empCode = stCode;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStCode() {
		return stCode;
	}
	
	public void setStCode(int stCode) {
		this.stCode = stCode;
	}
	
	public void generatePayslip() {
		System.out.println("Student not in Register");
	}
}
