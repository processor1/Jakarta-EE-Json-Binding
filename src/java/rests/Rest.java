/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rests;

import doas.StudentDao;
import entities.Student;
import java.util.List;
import java.util.ArrayList;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Mobile Apps
 */
@Path("/listdata")
public class Rest {

    @GET
    // @Path("/listdata")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> listData() {
        List<String> listStr = new ArrayList<>();
        listStr.add("I");
        listStr.add("LOVE");
        listStr.add("JAKARTEE");
        listStr.add(".");
        return listStr;
    }

    @GET
    @Path("/students")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> students() {

        StudentDao dao = new StudentDao();
        dao.init();
        return dao.getAllStudent();
    }
}
