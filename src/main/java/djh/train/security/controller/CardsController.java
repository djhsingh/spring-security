package djh.train.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping(value = "/cards")
    public String getCards(){
        return "Welcome to getCards";
    }
}
