package edu.neu.mgen;
import java.util.*;

class Student {
    private int stdID;
    private String fName;
    private String lName;

    public Student(int studentID, String firstName, String lastName) {
        this.stdID = studentID;
        this.fName = firstName;
        this.lName = lastName;
    }

    public int getStdID() {
        return stdID;
    }

    @Override
    public String toString() {
        return "StudentID: " + stdID + ", Name: " + fName + " " + lName;
    }
}

class EngClass {
    private List<Student> students;

    public EngClass() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(int studentID) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStdID() == studentID) {
                iterator.remove();
                return;
            }
        }
    }

    public void displayStudents() {
        System.out.println("List of Students in Engineering Class:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

public class ChapNine {
    public static void main(String[] args) {
        
        EngClass engClass = new EngClass();

        // Add
        engClass.addStudent(new Student(1, "Ahsan", "Syed"));
        engClass.addStudent(new Student(2, "Yiran", "Chen"));
        engClass.addStudent(new Student(3, "Yan", "Zhang"));

        // Delete
        engClass.deleteStudent(2);

        // Display
        engClass.displayStudents();

    }
}
