package guru.jokes.gurujokes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import guru.jokes.gurujokes.services.JokeService;

@Controller
public class JokeController {

    private JokeService jokes;

    @Autowired
    public JokeController(JokeService jokes){
        this.jokes = jokes;
    }


    @RequestMapping("/")
    public String showJokes(Model model) {
        model.addAttribute("joke", jokes.getJoke());
        return "chucknorris";
    }
}
