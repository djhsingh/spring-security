package djh.train.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping(value = "/contact")
    public String getContact(){
        return "Welcome to getContact";
    }
}
