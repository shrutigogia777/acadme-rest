package com.acadme;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("subjects")
public class SubjectResource {

    @GET
    public String getAllSubjects() {
        return "All Subjects";
    }

    @GET
    @Path("{id}")
    public String getAllSubjectById(@PathParam("id") int id) {
        return "subject #" + id;
    }
}
