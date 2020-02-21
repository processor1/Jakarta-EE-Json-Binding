/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.entities;

import javax.inject.Inject;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Mobile Apps
 */
@Path("/jsontudents")
public class StudentToJson {

    @Inject
    doas.StudentDao students;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String studentToJson() {
        Jsonb json = JsonbBuilder.create();
        return json.toJson(students.getAllStudent());
    }
}
