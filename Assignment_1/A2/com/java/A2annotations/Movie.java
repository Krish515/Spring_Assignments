package com.java.A2annotations;

public class Movie {
	private String movieId;
	private String movieName;
	private String movieActor;
	public String getMovieId() {
	    System.out.println("Movie ID : "+movieId);
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
	    System.out.println("Movie Name : "+movieName);  
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieActor() {
	    System.out.println("Movie Actor : "+movieActor);  
		return movieActor;
	}
	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}
	
}
