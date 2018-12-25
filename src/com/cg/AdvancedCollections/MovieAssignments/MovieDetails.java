package com.cg.AdvancedCollections.MovieAssignments;

public class MovieDetails {

	private String movieName,leasActor,leadActress,genre;

	public MovieDetails(String movieName, String leasActor, String leadActress, String genre) {
		super();
		this.movieName = movieName;
		this.leasActor = leasActor;
		this.leadActress = leadActress;
		this.genre = genre;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLeasActor() {
		return leasActor;
	}

	public void setLeasActor(String leasActor) {
		this.leasActor = leasActor;
	}

	public String getLeadActress() {
		return leadActress;
	}

	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", leasActor=" + leasActor + ", leadActress=" + leadActress
				+ ", genre=" + genre + "]";
	}
	
	
}
