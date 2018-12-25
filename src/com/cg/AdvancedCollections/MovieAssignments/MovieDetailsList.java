package com.cg.AdvancedCollections.MovieAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieDetailsList {
	
	private static final String SortByMovieName ="Movie";
	private static final String SortByLeadActor ="Actor";
	private static final String SortByLeadActress ="Actress";
	private static final String SortByGenre ="Genre";
	
	List<MovieDetails> movieList = new ArrayList<>();
	
	public void addMovie(MovieDetails movieDetails) {
		movieList.add(movieDetails);
	}
	
	public boolean removeMovie(MovieDetails movieDetailse) {
		boolean removed = movieList.remove(movieDetailse);
		return removed;
	}
	
	public boolean removeAllMovies() {
		boolean removed = movieList.removeAll(movieList);
		if(removed == true)
			return true;
		else
			return false;
		
	}
	
	public MovieDetails getMovieByName(String movieName) {
		MovieDetails getMovieByMovieName = null;
		for (MovieDetails movieDetails : movieList) {
			if(movieDetails.getMovieName().equalsIgnoreCase(movieName)){
				getMovieByMovieName = movieDetails;
			}
		}
		
		return getMovieByMovieName;
	}
	
	
	public MovieDetails getMovieByGenre(String genre) {
		MovieDetails getMovieByMovieName = null;
		for (MovieDetails movieDetails : movieList) {
			if(movieDetails.getGenre().equalsIgnoreCase(genre))
				getMovieByMovieName=movieDetails;
		}
		return getMovieByMovieName;
	}
	
	
	public List<MovieDetails> sort(String sortBy){
		
		switch(sortBy)
		{
	
		case  SortByMovieName :
			
			Collections.sort(movieList,new Comparator<MovieDetails>() {
				@Override
				public int compare(MovieDetails movieOne, MovieDetails movieTwo) {
					return movieOne.getMovieName().compareTo(movieTwo.getMovieName());
					}
				});
			return movieList;

		case SortByLeadActor :
			
			Collections.sort(movieList, new Comparator<MovieDetails>() {

				@Override
				public int compare(MovieDetails leadActorOne, MovieDetails leadActorTwo) {
					return leadActorOne.getLeasActor().compareTo(leadActorTwo.getLeasActor());
					}	
				});
			return movieList;

		case SortByLeadActress : 
			
			Collections.sort(movieList, new Comparator<MovieDetails>() {

				@Override
				public int compare(MovieDetails actressOne, MovieDetails actressTwo) {	
					return actressOne.getLeadActress().compareTo(actressTwo.getLeadActress());
					}
				});
		return movieList;	

		case SortByGenre :
			
			Collections.sort(movieList, new Comparator<MovieDetails>()
			
				{
					@Override
					public int compare(MovieDetails genreOne, MovieDetails genreTwo) {
						return genreOne.getGenre().compareTo(genreTwo.getGenre());
					}
				});
				return movieList;
		
		default :
			
			return movieList;
		}
	}
}
