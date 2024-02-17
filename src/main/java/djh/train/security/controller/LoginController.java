package djh.train.security.controller;

import djh.train.security.model.Customer;
import djh.train.security.repo.CustomerRepository;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.logging.Logger;

@RestController
public class LoginController {

    private static final Logger _logger = Logger.getLogger(LoginController.class.getName());
    @Autowired
    private CustomerRepository _customerRepository;

    @Autowired
    private PasswordEncoder _passwordEncoder;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ResponseEntity<String> registerUser(@Valid @RequestBody Customer customer){
        Customer savedCustomer = null;
        ResponseEntity response = null;
        String hashPwd = _passwordEncoder.encode(customer.getPwd());
        customer.setPwd(hashPwd);
        _logger.info("Customer details are: "+customer);
        try{
            savedCustomer = _customerRepository.save(customer);
            if(savedCustomer.getId() > 0){
                response = ResponseEntity.status(HttpStatus.CREATED)
                        .body("Given user details are successfully registered");
            }
        } catch (Exception e){
                response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("An exception occured due to "+e.getMessage());
        }
        return  response;
    }
}
