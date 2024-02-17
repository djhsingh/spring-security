package djh.train.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping(value = "/account")
    public String getAccount(){
        return "Here is my getAccount";
    }
}
