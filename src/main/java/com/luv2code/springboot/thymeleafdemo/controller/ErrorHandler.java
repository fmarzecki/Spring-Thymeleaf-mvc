package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorHandler implements org.springframework.boot.web.servlet.error.ErrorController {
    
    // not existing urls will redirect to /employee/list
    @RequestMapping("/error")
    public String handleError() {
        // Redirect to the employees list page
        return "redirect:/";
    }

}
