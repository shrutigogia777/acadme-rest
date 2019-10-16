package com.acadme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("students")
public class StudentResource {

    @GET
    public String getAllStudents() {
        return "All students";
    }

    @GET
    @Path("{id}")
    public String getStudentById(@PathParam("id") int id) {
        return "Student #" + id;
    }
}
