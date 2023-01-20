import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    int rollNo;
    String name;
    int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + " Name: " + name + " Age: " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John", 20));
        students.add(new Student(2, "Mike", 18));
        students.add(new Student(3, "John", 21));
        students.add(new Student(4, "Jack", 19));
        students.add(new Student(5, "Jill", 22));

        //Printing the distinct names of students in uppercase
        System.out.println("Distinct names of students in uppercase: ");
        students.stream().map(s -> s.getName().toUpperCase())
                .distinct()
                .forEach(System.out::println);
        //Printing the details of students whose age is greater than 18
        System.out.println("Details of students whose age is greater than 18: ");
        students.stream().filter(s -> s.getAge() > 18)
                .forEach(System.out::println);

        //Printing the average age of students
        double averageAge = students.stream().mapToInt(Student::getAge).average().orElse(0);
        System.out.println("Average age of students: " + averageAge);
    }
}
