package org.example.Lesson5.Task1.Data;

public class Mail {
    private Human to;
    private Postman from;
    private String address;
    private  String data;

    public Mail(Human to, Postman from, String address, String data) {
        this.to = to;
        this.from = from;
        this.address = address;
        this.data = data;
    }

    public Mail() {

    }
    public Mail generateNewMail(){
//        to = new Human("Юра", "Островец");
//        from = new Postman("Никита", "дозиметрист");
        return new Mail(new Human("Юра", "Островец"),
                new Postman("Никита", "дозиметрист"),
                "Островец", "22.08.2023");
    }
}
