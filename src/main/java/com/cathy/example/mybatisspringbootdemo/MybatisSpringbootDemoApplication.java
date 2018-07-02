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

    private final CityMapper cityMapper;

    public MybatisSpringbootDemoApplication(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Bean
    CommandLineRunner sampleCommandLineRunner() {
        return (args) -> System.out.println(this.cityMapper.findByState("CA"));
    }

}
