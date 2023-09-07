package org.example.Lesson5.Task1.MVP;

public class HumanMailView implements View{
    /**
     *
     */
    @Override
    public void Return() {
        System.out.println("Возвращено");
    }

    /**
     *
     */
    @Override
    public void SendMail() {
        System.out.println("Отправленно");
    }

    /**
     *
     */
    @Override
    public void GetMail(String data) {
        System.out.println("Получено");

    }

    /**
     *
     */
    @Override
    public void TalkWithPostman() {
        System.out.println("Спросить у почтальона");
    }
}
