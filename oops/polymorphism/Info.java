package oops;

public class Info {

	public static void main(String[] args) {
		
		Base info1 = new StudentWelcome("Student");
		info1.generateWelcome();
		
		Base info2 = new TeacherWelcome("Teacher");
		info2.generateWelcome();
	}
}
