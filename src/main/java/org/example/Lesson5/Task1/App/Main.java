package org.example.Lesson5.Task1.App;

import org.example.Lesson5.Task1.Controller.Controller;
import org.example.Lesson5.Task1.Data.Mail;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        Mail mail = new Mail();
        mail = mail.generateNewMail();
        controller.start(mail);

    }
}
