package oops;

public class StudentMarksApp {
  
  public static void main(String[] args){
    CollegeStudent c1 = new CollegeStudent("Dawn", 20008, 9.2);
    SchoolStudent s1 = new SchoolStudent("Vaigarai", 28, 89);
    c1.generateMarksheet();
    s1.generateMarksheet();
  }
}                       
