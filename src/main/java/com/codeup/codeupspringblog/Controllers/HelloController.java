package com.codeup.codeupspringblog.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//this tell spring what kind of class this is, controller is specific to spring
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "This is the landing page!";
    }


    @RequestMapping(path = "/counter/{counterInit}", method = RequestMethod.GET)
    @ResponseBody
    public String initCounter(@PathVariable int counterInit) {
        return "counter reset to " + counterInit;
    }

}