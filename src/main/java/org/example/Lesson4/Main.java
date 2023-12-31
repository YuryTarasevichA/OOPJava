package org.example.Lesson4;

import org.example.Lesson4.HomeWork4.TeacherService;
import org.example.Lesson4.Task1.Student;
import org.example.Lesson4.Task2.StudentService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Student1",6,29);
        Student student2 = new Student("Student2",10,19);
//        List<Student> list = new ArrayList<>();
//        list.add(student2);
//        list.add(student1);
//        System.out.println(list);
//        list.sort(new StudentComporator());
//        System.out.println(list);
//        List<User> userList = new ArrayList<>();
//        Teacher teacher1 = new Teacher("Teacher1","Math");
//        Teacher teacher2 = new Teacher("Teacher2","Biology");
//        Teacher teacher3 = new Teacher("Teacher3","English");
//        Student student = new Student("Student", 52,19);
//        userList.add(student);
//        userList.add(student1);
//        userList.add(student2);
//        userList.add(teacher1);
//        userList.add(teacher2);
//        userList.add(teacher3);
//        System.out.println(userList);
//        userList.sort(new UserComporator<User>());
//        System.out.println(userList);
        StudentService studentService = new StudentService();
        studentService.createStudent("Student1",10,11);
        studentService.createStudent("Student2",14,12);
        studentService.createStudent("Student3",17,19);
        System.out.println(studentService.getAll());
        TeacherService teacherService = new TeacherService();
        teacherService.createTeacher("Teacher1","Biology");
        teacherService.createTeacher("Teacher2","Math");
        teacherService.createTeacher("Teacher3","Physics");
        teacherService.createTeacher("Teacher4","Geography");
        System.out.println(teacherService.getAll());
    }
}
