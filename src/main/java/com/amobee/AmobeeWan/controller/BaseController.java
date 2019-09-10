package com.amobee.AmobeeWan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;



@RestController
public class BaseController {


    @GetMapping("/")
    public String getQuestions(HttpEntity pageable) {
        return "HI";
    }
}
