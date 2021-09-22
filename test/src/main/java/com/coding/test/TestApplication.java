package com.coding.test;

import com.coding.test.model.Dog;
import com.coding.test.service.DogService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Slf4j
@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(DogService dogService){
//		return args -> {
//			ObjectMapper objectMapper = new ObjectMapper();
//			InputStream inputStream = Dog.class.getResourceAsStream("json/dog.json");
//			try{
//				Dog dog = objectMapper.readValue(inputStream, new TypeReference<Dog>() {});
//				dogService.saveDog(dog);
//			}
//			catch(IOException e){
//				log.error("Unable to save dogs data" + e.getMessage());
//			}
//
//		};
//	}

}
