package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        // TODO: Add at least 5 students
        students.add(new Student(1, "Beka", 4));
        students.add(new Student(2, "Meka", 3.7));
        students.add(new Student(3, "Deka", 3.8));
        students.add(new Student(4, "Arsen", 4));
        students.add(new Student(5, "Bakyt", 3.5));
        
    }

    public void removeLowGPA() {
        // TODO: Remove students with GPA < 2.0
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getGpa() < 2.0) {
                iterator.remove();
            }
        }
    }

    public void findHighestGPA() {
        // TODO: Find and print student with highest GPA
        Student maxGpa = students.get(0);
        for (Student s : students) {
            if (s.getGpa() > maxGpa.getGpa()) {
                maxGpa = s;
            }
        }
        System.out.println("Student with highest GPA: " + maxGpa);
    }

    public void insertAtIndex(Student student) {
        // TODO: Insert new student at index 2
        if (students.size() >= 2) {
            students.add(2, student);
        }else {
            students.add(student);
        }
    }

    public void printStudents() {
        // TODO: Print using Iterator
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
    }
    }
}
