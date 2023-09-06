package org.example.Lesson4.Task2;

import org.example.Lesson4.Student;

import java.util.List;
import java.util.logging.Logger;

public class StudentView <T extends Student> implements UserView<T>{
    public void sendOnConsole(List<T> students) {
        for(T user: students){
            System.out.println(user);
        }
    }

}
