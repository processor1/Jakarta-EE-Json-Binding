/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doas;

import java.util.List;
import java.util.ArrayList;

import entities.Student;

/**
 *
 * @author Mobile Apps
 */
public class StudentDao {

    List<Student> students = new ArrayList<>();

    public Student getStudentByIndex(int index) {
        Student student = students.get(index);
        return student;
    }

    public void addNewStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudent() {
        return students;
    }

    public void init() {
        Student student1 = new Student("Kwame", "James");
        Student student2 = new Student("Brown", "Mike");
        Student student3 = new Student("White", "Love");
        Student student4 = new Student("Tim", "Law");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
    }
}
