import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface Attendance {
    void markAttendance();

    void displayAttendance();
}

class Student extends Person implements Attendance {
    private String grade;
    private List<String> attendance;

    public Student(String name, int id, String grade) {
        super(name, id);
        this.grade = grade;
        this.attendance = new ArrayList<>();
    }

    @Override
    public void markAttendance() {
        attendance.add("Present");
    }

    @Override
    public void displayAttendance() {
        System.out.println("Attendance for " + getName() + ": " + attendance);
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

class Teacher extends Person implements Attendance {
    private String subject;
    private List<String> attendance;

    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
        this.attendance = new ArrayList<>();
    }

    @Override
    public void markAttendance() {
        attendance.add("Present");
    }

    @Override
    public void displayAttendance() {
        System.out.println("Attendance for " + getName() + ": " + attendance);
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 1, "10th Grade");
        Teacher teacher = new Teacher("Mr. Smith", 101, "Mathematics");

        student.markAttendance();
        teacher.markAttendance();

        student.displayDetails();
        student.displayAttendance();

        teacher.displayDetails();
        teacher.displayAttendance();
    }
}
