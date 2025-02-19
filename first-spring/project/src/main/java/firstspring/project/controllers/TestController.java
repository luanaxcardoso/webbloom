package firstspring.project.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, Luana Cardoso!";
    }

    @RequestMapping("/greet")
    public String greet() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/about")
    public String about() {
        return "This is a simple Spring Boot application!";
    }

    @RequestMapping("/goodbye")
    public String goodbye() {
        return "Goodbye, Luana! Have a great day!";
    }
}
