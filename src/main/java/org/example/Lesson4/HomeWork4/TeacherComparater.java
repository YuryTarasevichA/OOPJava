package org.example.Lesson4.HomeWork4;

import org.example.Lesson4.Task1.Teacher;

import java.util.Comparator;

public class TeacherComparater<T extends Teacher> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getScore() - o2.getScore();
    }
}
