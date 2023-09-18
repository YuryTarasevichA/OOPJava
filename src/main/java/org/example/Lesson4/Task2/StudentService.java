package org.example.Lesson4.Task2;


import org.example.Lesson4.Task1.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void createStudent(String name, int score, int age) {
        Student student = new Student(name, score, age);
        students.add(student);
    }


    @Override
    public void createTeacher(String name, String objectToTeacher) {}
}
