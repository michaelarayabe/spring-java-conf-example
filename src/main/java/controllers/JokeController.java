package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import services.JokeService;
import services.JokeServiceImpl;

@Controller
public class JokeController {

    private final JokeService jokes;

    public JokeController(JokeService quotes){
        this.jokes = quotes;
    }


    @RequestMapping({"/", ""})
    public String showJokes(Model model) {
        model.addAttribute("joke", jokes.getJoke());
        return "chucknorris";
    }
}
