package it.aulab.learningplatform2;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class LearningPlatform2Application {

	public static void main(String[] args) {
		SpringApplication.run(LearningPlatform2Application.class, args);
	}

	@Bean
	public ModelMapper instanceModelMapper(){
		ModelMapper mapper = new ModelMapper();

		return mapper;
	}


}
