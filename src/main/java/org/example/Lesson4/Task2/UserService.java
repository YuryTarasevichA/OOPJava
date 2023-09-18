package org.example.Lesson4.Task2;

import java.util.List;

public interface UserService<T> {
    List<T> getAll();
    void createStudent(String name, int score, int age);
    void createTeacher(String name, String objectToTeacher);
}
