package com.jpa.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        /* 내장 was 사용을 권장하는 이유 */
        // 언제 어디서나 같은 환경에서 스프링부트를 배포할 수 있기 때문
        SpringApplication.run(Application.class, args);
    }
}
