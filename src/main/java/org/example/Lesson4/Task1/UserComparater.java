package org.example.Lesson4.Task1;

import java.util.Comparator;

public class UserComparater<T extends User> implements Comparator<T> {

    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(T o1, T o2) {
        return o1.getScore() - o2.getScore();
    }
}
