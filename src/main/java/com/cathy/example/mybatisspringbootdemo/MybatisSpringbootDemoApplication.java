package com.cathy.example.mybatisspringbootdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MybatisSpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringbootDemoApplication.class, args);
    }

    private final UsersMapper usersMapper;

    public MybatisSpringbootDemoApplication(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Bean
    CommandLineRunner sampleCommandLineRunner() {
        return (args) -> System.out.println(this.usersMapper.selectByPrimaryKey(1));
    }

}
