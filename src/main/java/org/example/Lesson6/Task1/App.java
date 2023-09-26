package org.example.Lesson6.Task1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        Book book = new Book("Властелин колец", "Руэл Толкин", new BookGenere("фентази"));
        List<Book> list = new ArrayList<>();
        generateBookList(list);
        Bibliory bibliory = new Bibliory(list);
        Book aaa1 = bibliory.findByAuthor("Aaa1");
        System.out.println(aaa1);
        Formatter formatter = new JsonFormatter();
    }

    /**
     * @apiNote Создаёт лист книг
     * @param list
     */

    private static void generateBookList(List<Book> list) {
        for (int i = 0; i < 4; i++) {
            list.add(new Book("asdf" + i,
                    "Aaa" + i,
                    new BookGenere("Fantasy"+ i)));
        }
    }
}
