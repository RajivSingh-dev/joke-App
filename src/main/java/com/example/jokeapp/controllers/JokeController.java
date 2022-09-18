package com.example.jokeapp.controllers;


import com.example.jokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {



    @GetMapping("/home")
    public String home()
    {
return "index";
    }


}
