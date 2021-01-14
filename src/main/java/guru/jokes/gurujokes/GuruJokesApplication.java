package guru.jokes.gurujokes;

import controllers.JokeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import services.JokeServiceImpl;

@SpringBootApplication
public class GuruJokesApplication {

    public static void main(String[] args) {
       ApplicationContext ap = SpringApplication.run(GuruJokesApplication.class, args);
       JokeServiceImpl jsi = (JokeServiceImpl)ap.getBean("jokeController");
        System.out.println(jsi.getJoke());

    }

}
