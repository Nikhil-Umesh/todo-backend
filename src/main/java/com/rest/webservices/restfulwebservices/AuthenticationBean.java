package com.rest.webservices.restfulwebservices;

public class AuthenticationBean {
    private String message;
    public AuthenticationBean(String message){
         this.message = message;
    }
    public String getMessage()
    {
        return message;
    }
}
