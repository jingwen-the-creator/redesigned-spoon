package com.jz.redesignedspoon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */

@RestController
public class LoginController {

    @RequestMapping("/")
    public String Login(){
        return "hello";
    }
}
