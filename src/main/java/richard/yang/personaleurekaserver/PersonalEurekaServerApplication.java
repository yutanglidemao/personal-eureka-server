package richard.yang.personaleurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PersonalEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalEurekaServerApplication.class, args);
    }

}
