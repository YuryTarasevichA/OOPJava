package org.example.Lesson4.HomeWork4;

import org.example.Lesson4.Task1.Teacher;
import org.example.Lesson4.Task2.UserView;

import java.util.List;

public class TeacherView<T extends Teacher> implements UserView<T> {

    @Override
    public void sendOnConsole(List<T> teachers) {
        for (T user: teachers) System.out.println(user);
    }

}
