package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Yura", "Kantemir");
        Student student2 = new Student(2, "Yura1", "Kantemir");
        Student student3 = new Student(3, "Yura2", "Kantemir");

        StudentsGroup group = new StudentsGroup(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.removeStudent(3);

        Task newTask = new Task(1,"Task1Description");
        group.addTask(newTask);

        group.markTaskAsComplete(2,1);




    }
}