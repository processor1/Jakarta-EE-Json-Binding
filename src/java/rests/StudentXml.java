/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rests;

import xml.entities.StudentDao;
import xml.entities.Student;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Mobile Apps
 */
@Path("/studentsXml")
public class StudentXml {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Student> studentsXml() {
        StudentDao dao = new StudentDao();
        dao.init();
        return dao.getAllStudent();
    }
}
