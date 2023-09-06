package org.example.Lesson4;

public class Teacher extends User{
    private String objectToTeacher;

    public Teacher(String name, String objectToTeacher) {
        super(name);
        this.objectToTeacher = objectToTeacher;
    }

    public Teacher(String name) {
        super(name);
    }

    public String getObjectToTeacher() {
        return objectToTeacher;
    }

    public void setObjectToTeacher(String objectToTeacher) {
        this.objectToTeacher = objectToTeacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "objectToTeacher='" + objectToTeacher + '\'' +
                "} " + super.toString();
    }
}
