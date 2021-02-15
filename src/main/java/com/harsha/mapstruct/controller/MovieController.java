package com.harsha.mapstruct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.harsha.mapstruct.dto.MovieDTO;
import com.harsha.mapstruct.model.Movie;
import com.harsha.mapstruct.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	MovieService movieService;
	
	@GetMapping("/getAllMovies")
	public @ResponseBody ResponseEntity<List<Movie>> findPersonMovie() {
		return new ResponseEntity<List<Movie>>(movieService.findAllMovies(), HttpStatus.OK);
	}
	
	@GetMapping("/getAllMoviesDTO")
	public @ResponseBody ResponseEntity<List<MovieDTO>> findPersonMovieDTO() {
		return new ResponseEntity<List<MovieDTO>>(movieService.findAllMoviesDTO(), HttpStatus.OK);
	}
}
