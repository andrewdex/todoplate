package com.todoplate.rest;

import javax.ws.rs.core.MediaType;

import angular.domain.User;
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
    @Produces(MediaType.APPLICATION_JSON)
    public User getDefaultUserInJSON() {
        UserService userService = new UserService();
        return userService.getDefaultUser();
    }
}

