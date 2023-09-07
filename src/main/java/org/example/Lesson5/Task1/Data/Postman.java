package org.example.Lesson5.Task1.Data;

public class Postman extends User {
    private String occupation;


    public Postman(String name, String occupation) {
        super(name);
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
