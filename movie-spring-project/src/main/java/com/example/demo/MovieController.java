package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movies")
	public List<Movie> getMovies(){
		return movieService.getMovies();
	}
	
	@PostMapping("/movies")
	public Movie addMovie(@RequestBody Movie movie) {
		return movieService.addMovie(movie);
	}
	
	@DeleteMapping("/movies/{id}")
	public void deleteMovie(@PathVariable String id) {
		movieService.deleteMovie(id);
	}
	
//	@GetMapping("/donors/{id}")
//	public Donor getDonorById(@PathVariable String id) {
//		return donorservices.getDonorById(id);
//	}
	
//	@PutMapping("/donors/{id}")
//	public Donor updateDonor(@PathVariable String id, @RequestBody Donor updatedDonor) {
//        return donorservices.updateDonor(id, updatedDonor);
//    }
}
