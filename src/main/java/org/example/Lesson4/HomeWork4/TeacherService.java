package org.example.Lesson4.HomeWork4;

import org.example.Lesson4.Task1.Teacher;
import org.example.Lesson4.Task2.UserService;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }


    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void createStudent(String name, int score, int age) {}


    @Override
    public void createTeacher(String name, String objectToTeacher) {
        Teacher teacher = new Teacher(name, objectToTeacher);
        teachers.add(teacher);
    }


}
