package org.example.Lesson5.Task1.Service;

import org.example.Lesson5.Task1.Data.Mail;

public class MaiLService implements MailInterface{

    /**
     *
     */
    @Override
    public String sendMail(Mail data) {
//        System.out.println("Сообщение отправлено");
        return "Письмо " + data + " Было отправленно";
    }

    /**
     *
     */
    @Override
    public void RemoveMail() {
        System.out.println("Возврат");
    }

    /**
     *
     */
    @Override
    public void GetMail() {
        System.out.println("Получено сообщение");
    }
}
