package djh.train.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping(value = "/loans")
    public String getLoans(){
        return "Welcome to getLoans";
    }
}
