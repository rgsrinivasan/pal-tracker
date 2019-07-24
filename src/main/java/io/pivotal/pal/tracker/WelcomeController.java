package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

<<<<<<< HEAD
    private String welcomeMessage;

    public WelcomeController(
            @Value("${welcome.message}") String welcomeMessage
    ) {
        this.welcomeMessage = welcomeMessage;
    }

    @GetMapping("/")
    public String sayHello() {
        return welcomeMessage;
    }
=======
    private String message;

    public WelcomeController(@Value("${welcome.message}") String message)
    {
        this.message = message;
    }
    @GetMapping("/")
    public String sayHello() {
        return message;
    }

>>>>>>> 4ec24e575cf6fe2cdd91496554bd0762428fc883
}
