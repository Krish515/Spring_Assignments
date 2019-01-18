package com.java.A2annotations;
import org.springframework.context.annotation.*;

@Configuration
public class MovieConfig {
	@Bean
	public Movie movie() {
		return new Movie();
	}

}
