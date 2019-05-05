package org.jp.SpringBootMongoDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"org.jp.controllers","org.jp.services"})
public class SpringBootMongoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDemoApplication.class, args);
	}

}
