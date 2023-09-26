package com.sangsang.imagination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.client.RestTemplate;

@EnableJpaAuditing
@SpringBootApplication
public class ImaginationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImaginationApplication.class, args);
    }

    public RestTemplate restTemplate() {return new RestTemplate();}

}
