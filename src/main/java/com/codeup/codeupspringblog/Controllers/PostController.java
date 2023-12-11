package com.codeup.codeupspringblog.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String getAllPosts() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    public String getPostDetail(@PathVariable long id) {
        return "view an individual post" + id;
    }

    @GetMapping("/posts/create")
    public String getCreatePage() {
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String submitPost() {
        return "create a new post";
    }

}
