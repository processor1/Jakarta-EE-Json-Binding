/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.json.write;


import javax.json.JsonObject;
import javax.json.JsonWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.json.Json;


/**
 *
 * @author Mobile Apps
 */
public class WriteJsonObject {


    public void writeObject()throws IOException{
        
        JsonObject json=Json.createObjectBuilder().add("Name", "User").build();
        
        JsonWriter jsw=Json.createWriter(new FileWriter("user.json"));
        
    }
}
