package com.todoplate.rest;

import angular.service.UserService;

/**
 * Created by Dilusha on 3/1/2015.
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/users")
public class UserRestService {

    @GET
    @Produces("text/plain")
    public String hello() {

        return "wow..";
    }
}
