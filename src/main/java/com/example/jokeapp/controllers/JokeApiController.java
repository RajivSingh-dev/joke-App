package com.example.jokeapp.controllers;


import com.example.jokeapp.services.JokeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeApiController {

    private final JokeService jokeService;


    public JokeApiController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/jokes")
   public String showJoke()
    {
        return  jokeService.getJoke();
    }

}
