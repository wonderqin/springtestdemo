package com.hantele;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hantele.dao")
public class SpringtestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringtestdemoApplication.class, args);
	}
}
