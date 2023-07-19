package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> getMovies(){
		List<Movie> movies= new ArrayList<>();
		movieRepository.findAll().forEach(movies::add);
		return movies;
	}
	
//	public Donor getDonorById(String id) {
//		return donorRepository.findById(id).orElse(null);
//	}
	
//	public Donor updateDonor(String id,Donor updateDonor) {
//		Donor donor=donorRepository.findById(id).orElse(null);
//		if(donor!=null) {
//			donor.setFullName(updateDonor.getFullName());
//			donor.setBloodGroup(updateDonor.getBloodGroup());
//			donor.setMobileNumber(updateDonor.getMobileNumber());
//			donor.setCountry(updateDonor.getCountry());
//			donor.setState(updateDonor.getState());
//			donor.setDistrict(updateDonor.getDistrict());
//			donor.setCity(updateDonor.getCity());
//			donor.setEmailId(updateDonor.getEmailId());
//			donor.setUserId(updateDonor.getUserId());
//			donor.setPassword(updateDonor.getPassword());
//			donor.setConfirmPassword(updateDonor.getConfirmPassword());
//			donor.setAvailability(updateDonor.getAvailability());
//			return donorRepository.save(donor);
//		}
//		return null;
//		
//	}
	
	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);
	}
	
	public void deleteMovie(String id) {
		movieRepository.deleteById(id);
	}
}
