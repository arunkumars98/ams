package com.abcbank.ams.model;

import lombok.Data;

@Data
public class AuthenticationRequest {

    private String emailId;
    private String password;

}
