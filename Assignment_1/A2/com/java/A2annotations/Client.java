package com.java.A2annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class Client {
 public static void main(String[] args) {
	 ApplicationContext ctx= new AnnotationConfigApplicationContext(Movie.class);
	 Movie movie=ctx.getBean(Movie.class);
	 System.out.println("Using Annotations");
	 movie.setMovieId("M001");
	 movie.setMovieName("Mission Impossible 10");
	 movie.setMovieActor("Tom Cruise");
	 movie.getMovieId();
	 movie.getMovieName();
	 movie.getMovieActor();
	 		 
 }
}
