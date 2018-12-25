package com.cg.AdvancedCollections.MovieAssignments;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MovieDetailsTest {
	private MovieDetails movieDetailsa,movieDetailsb,movieDetailsc,movieDetailsd,movieDetailse;
	private MovieDetailsList movieDetailsList;
	@Before
	public void setUp() {
		movieDetailsa = new MovieDetails("KGF", "Yash", "Srinidhi Shetty", "Action");
		movieDetailsb = new MovieDetails("Baahubhali", "Prabhas", "Anushka Shetty", "Adventure");
		movieDetailsc = new MovieDetails("Baadhshah", "NTR", "Kajal Agarwal", "Comedy");
		movieDetailsd = new MovieDetails("MCA","Nani", "Sai Pallavi","Drama");
		movieDetailse = new MovieDetails("Vaishali", "Aadi Pinisetty", "Vaishali", "Horror");
		movieDetailsList = new MovieDetailsList();
	}
	@Test
	public void addMovie() {
		
		movieDetailsList.addMovie(movieDetailsa);
		movieDetailsList.addMovie(movieDetailsb);
		movieDetailsList.addMovie(movieDetailsc);
		movieDetailsList.addMovie(movieDetailsd);
		movieDetailsList.addMovie(movieDetailse);
	}

	@Test
	public void removeMovie() {
		
		movieDetailsList.addMovie(movieDetailsa);
		movieDetailsList.addMovie(movieDetailsb);
		movieDetailsList.addMovie(movieDetailsc);
		movieDetailsList.addMovie(movieDetailsd);
		movieDetailsList.addMovie(movieDetailse);
		boolean isRemoved=movieDetailsList.removeMovie(movieDetailse);
		assertEquals(true,isRemoved);
	}

	@Test
	public void removeAllMovies() {
		
		movieDetailsList.addMovie(movieDetailsa);
		movieDetailsList.addMovie(movieDetailsb);
		movieDetailsList.addMovie(movieDetailsc);
		movieDetailsList.addMovie(movieDetailsd);
		boolean isAllRemoved=movieDetailsList.removeAllMovies();
		assertEquals(true,isAllRemoved);
	}
	
	
	@Test
	public void testForFindMovieByMovieName() {
		movieDetailsList.addMovie(movieDetailsa);
		movieDetailsList.addMovie(movieDetailsb);
		movieDetailsList.addMovie(movieDetailsc);
		movieDetailsList.addMovie(movieDetailsd);
		movieDetailsList.addMovie(movieDetailse);
		MovieDetails result = movieDetailsList.getMovieByName("vaishali");
		String expected = "MovieDetails [movieName=Vaishali, leasActor=Aadi Pinisetty, leadActress=Vaishali, genre=Horror]";
		String actual = result.toString();
		assertEquals(expected,actual);
	}

	@Test
	public void findMovieByGenre() {
		movieDetailsList.addMovie(movieDetailsa);
		movieDetailsList.addMovie(movieDetailsb);
		movieDetailsList.addMovie(movieDetailsc);
		movieDetailsList.addMovie(movieDetailsd);
		movieDetailsList.addMovie(movieDetailse);
		MovieDetails result = movieDetailsList.getMovieByGenre("action");
		String expected = "MovieDetails [movieName=KGF, leasActor=Yash, leadActress=Srinidhi Shetty, genre=Action]";
		String actual = result.toString();
		assertEquals(expected,actual);
	}

	
	
	
	
	
	@Test
	public void sortByMovieName() {
		movieDetailsList.addMovie(movieDetailsa);
		movieDetailsList.addMovie(movieDetailsb);
		movieDetailsList.addMovie(movieDetailsc);
		movieDetailsList.addMovie(movieDetailsd);
		movieDetailsList.addMovie(movieDetailse);
		
		String actual = movieDetailsList.sort("Movie").toString();
		String expected = "[MovieDetails [movieName=Baadhshah, leasActor=NTR, leadActress=Kajal Agarwal, genre=Comedy],"
						+ " MovieDetails [movieName=Baahubhali, leasActor=Prabhas, leadActress=Anushka Shetty, genre=Adventure],"
						+ " MovieDetails [movieName=KGF, leasActor=Yash, leadActress=Srinidhi Shetty, genre=Action],"
						+ " MovieDetails [movieName=MCA, leasActor=Nani, leadActress=Sai Pallavi, genre=Drama],"
						+ " MovieDetails [movieName=Vaishali, leasActor=Aadi Pinisetty, leadActress=Vaishali, genre=Horror]]";
		assertEquals(expected,actual);
	}	

	@Test
	public void sortByMovieLeadActor() {
		movieDetailsList.addMovie(movieDetailsa);
		movieDetailsList.addMovie(movieDetailsb);
		movieDetailsList.addMovie(movieDetailsc);
		movieDetailsList.addMovie(movieDetailsd);
		movieDetailsList.addMovie(movieDetailse);
		
		String actual = movieDetailsList.sort("Actor").toString();
		String expected = "[MovieDetails [movieName=Vaishali, leasActor=Aadi Pinisetty, leadActress=Vaishali, genre=Horror],"
					+ " MovieDetails [movieName=Baadhshah, leasActor=NTR, leadActress=Kajal Agarwal, genre=Comedy],"
					+ " MovieDetails [movieName=MCA, leasActor=Nani, leadActress=Sai Pallavi, genre=Drama],"
					+ " MovieDetails [movieName=Baahubhali, leasActor=Prabhas, leadActress=Anushka Shetty, genre=Adventure],"
					+ " MovieDetails [movieName=KGF, leasActor=Yash, leadActress=Srinidhi Shetty, genre=Action]]";
		assertEquals(expected,actual);
	}
	

	@Test
	public void sortByMovieLeadActress() {
		movieDetailsList.addMovie(movieDetailsa);
		movieDetailsList.addMovie(movieDetailsb);
		movieDetailsList.addMovie(movieDetailsc);
		movieDetailsList.addMovie(movieDetailsd);
		movieDetailsList.addMovie(movieDetailse);
		
		String actual = movieDetailsList.sort("Actress").toString();
		String expected = "[MovieDetails [movieName=Baahubhali, leasActor=Prabhas, leadActress=Anushka Shetty, genre=Adventure],"
				+ " MovieDetails [movieName=Baadhshah, leasActor=NTR, leadActress=Kajal Agarwal, genre=Comedy],"
				+ " MovieDetails [movieName=MCA, leasActor=Nani, leadActress=Sai Pallavi, genre=Drama],"
				+ " MovieDetails [movieName=KGF, leasActor=Yash, leadActress=Srinidhi Shetty, genre=Action],"
				+ " MovieDetails [movieName=Vaishali, leasActor=Aadi Pinisetty, leadActress=Vaishali, genre=Horror]]";
		assertEquals(expected,actual);
	}
		
	@Test
	public void sortByGenre() {
		movieDetailsList.addMovie(movieDetailsa);
		movieDetailsList.addMovie(movieDetailsb);
		movieDetailsList.addMovie(movieDetailsc);
		movieDetailsList.addMovie(movieDetailsd);
		movieDetailsList.addMovie(movieDetailse);
		
		String actual = movieDetailsList.sort("Genre").toString();
		String expected ="[MovieDetails [movieName=KGF, leasActor=Yash, leadActress=Srinidhi Shetty, genre=Action],"
				+ " MovieDetails [movieName=Baahubhali, leasActor=Prabhas, leadActress=Anushka Shetty, genre=Adventure],"
				+ " MovieDetails [movieName=Baadhshah, leasActor=NTR, leadActress=Kajal Agarwal, genre=Comedy],"
				+ " MovieDetails [movieName=MCA, leasActor=Nani, leadActress=Sai Pallavi, genre=Drama],"
				+ " MovieDetails [movieName=Vaishali, leasActor=Aadi Pinisetty, leadActress=Vaishali, genre=Horror]]";
		assertEquals(expected,actual);
	}
}