package djh.train.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@ComponentScan("djh.train.security")
@EnableJpaRepositories("djh.train.security.repo")
@EntityScan("djh.train.security.model")
@EnableWebSecurity
public class SpringSecurityBasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityBasicsApplication.class, args);
    }

}
