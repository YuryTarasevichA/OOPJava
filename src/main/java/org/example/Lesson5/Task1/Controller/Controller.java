package org.example.Lesson5.Task1.Controller;

import org.example.Lesson5.Task1.Data.Mail;
import org.example.Lesson5.Task1.MVP.HumanMailView;
import org.example.Lesson5.Task1.Service.MaiLService;

public class Controller {
    MaiLService maiLService = new MaiLService();
    HumanMailView humanMailView = new HumanMailView();

    public void start(Mail data) {

        String qwe = maiLService.sendMail(data);
        humanMailView.GetMail(qwe);
    }
}
