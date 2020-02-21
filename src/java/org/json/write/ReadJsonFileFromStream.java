/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.json.write;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author Mobile Apps
 */
public class ReadJsonFileFromStream {

    String hello = "I love Jakarta EE Server ";

    public String writeToFile() {
        InputStream inpt = new ByteArrayInputStream(hello.getBytes());
        JsonReader jread = Json.createReader(inpt);
        JsonObject jobj = jread.readObject();
        return jobj.toString();
    }
}
