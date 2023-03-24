package org.tvt.postServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PostFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(PostFeignApplication.class, args);
    }
}
