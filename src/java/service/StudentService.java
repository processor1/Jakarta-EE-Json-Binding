/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import doas.StudentDao;
import entities.Student;
import java.math.BigDecimal;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import java.util.List;
import javax.inject.Named;

/**
 *
 * @author Mobile Apps
 *
 */
@Named("students")
public class StudentService {

    public String writeJsonObject() throws Exception {

        JsonObjectBuilder builder = Json.createObjectBuilder();

        StudentDao student = new StudentDao();
        student.init();

        List<Student> students = student.getAllStudent();
        System.out.println("Size  ********* " + students.size());
        
        for(Student st : students) {
            builder.add("Students", Json.createObjectBuilder().add("First Name", st.getFirstName()).add("Last Name",st.getFirstName()));
        }
        JsonObject obj = builder.build();
        System.out.println("******************* " + obj.toString());
        return obj.toString();
    }
   
}
