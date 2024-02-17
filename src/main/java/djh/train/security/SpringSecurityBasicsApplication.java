package djh.train.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("djh.train.security")
public class SpringSecurityBasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityBasicsApplication.class, args);
    }

}
