package com.github.ud.anton.jokeschucknorris.controllers;

import com.github.ud.anton.jokeschucknorris.services.JokeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeServiceImpl jokeServiceImpl;

    @Autowired
    public JokeController(JokeServiceImpl jokeServiceImpl) {
        this.jokeServiceImpl = jokeServiceImpl;
    }

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("joke", jokeServiceImpl.getJoke());
        return "chucknoriss";
    }
}
