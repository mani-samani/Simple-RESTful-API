package geospatial.api.homework.assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String sayHello() {
        return "Welcome to the ATM application. " +
                "You can submit a new ATM by making a POST request to /api/atm endpoint.";
    }
}
