package com.codeup.codeupspringblog.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

public class HomeController {

    @GetMapping("/landing page")
    @ResponseBody
    public String hello() {
        return "This is a landing page!";
    }

}
