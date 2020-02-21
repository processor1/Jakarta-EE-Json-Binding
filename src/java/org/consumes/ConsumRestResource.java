/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.consumes;

import java.util.List;
import entities.Student;
import java.util.ArrayList;
import javax.json.bind.Jsonb;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import javax.json.bind.JsonbBuilder;

/**
 *
 * @author Mobile Apps
 */
public class ConsumRestResource {
    
     List<Student> students = new java.util.ArrayList<>();

    public List<Student> getAllStudent() throws Exception {

        Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client.target("http://localhost:8080/Json-Jakarta_EE/rest/students");

       
        
        String string = (target.request(MediaType.APPLICATION_JSON).get(new GenericType<String>() {

            Jsonb json = JsonbBuilder.create();
            //students = json.fromJson(string, ArrayList.class);
        }));

        return students;
    }

    private Object JsonbBuilder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
