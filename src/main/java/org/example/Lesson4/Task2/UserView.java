package org.example.Lesson4.Task2;

import org.example.Lesson4.User;

import java.util.List;

public interface UserView<T extends User> {
    public void sendOnConsole(List<T>users);
}
