package djh.train.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping(value = "/balance")
    public String getBalance(){
        return "Welcome to getBalance";
    }
}
