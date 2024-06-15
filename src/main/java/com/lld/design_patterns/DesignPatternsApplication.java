package com.lld.design_patterns;

import com.lld.design_patterns.builder.Dog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DesignPatternsApplication {

	public static void main(String[] args) {
		Dog dog = new Dog.DogBuilder().setName("Rio")
			.setGender("TRANS").build();
		log.info("Dog name: {}", dog.getName());
	}

}
