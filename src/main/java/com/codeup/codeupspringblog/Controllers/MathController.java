package com.codeup.codeupspringblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @GetMapping(path = "/add/{num1}/and/{num2}")
    @ResponseBody
    public String addNums(@PathVariable int num1, @PathVariable int num2) {
        return num1 + " plus " + num2 + " = " + (num1 + num2);
    }

    @GetMapping(path = "/subtract/{num1}/from/{num2}")
    @ResponseBody
    public String subNums(@PathVariable int num1, @PathVariable int num2) {
        return num1 + " minus " + num2 + " = " + (num1 - num2);
    }

    @GetMapping(path = "/multiply/{num1}/and/{num2}")
    @ResponseBody
    public int multiplyNums(@PathVariable int num1, @PathVariable int num2) {
        return (num1 * num2);
    }

    @GetMapping(path = "/divide/{num1}/by/{num2}")
    @ResponseBody
    public String divideNums(@PathVariable double num1, @PathVariable double num2) {
        return num1 + " divided " + num2 + " = " + (num1 / num2);
    }

}
