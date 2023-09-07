package org.example.Lesson5.Task1.Service;

import org.example.Lesson5.Task1.Data.Mail;

public interface MailInterface {
    public String sendMail(Mail data);
    public void RemoveMail();
    public void GetMail();
}
