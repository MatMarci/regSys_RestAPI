package com.sysReg_restAPI.AppBackEnd.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

public class BackEndController {

    private static final Logger LOG = LoggerFactory.getLogger(BackEndController.class);

    public static final String HELLO_TEXT = "Hello from Spring Boot Backend!";

    public String sayHello() {
        LOG.info("GET called on /hello resource");
        return HELLO_TEXT;
    }

}