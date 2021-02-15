package com.harsha.mapstruct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.harsha.mapstruct.dto.PersonMovieDTO;
import com.harsha.mapstruct.model.PersonMovie;
import com.harsha.mapstruct.service.PersonMovieService;

@RestController
@RequestMapping("/personMovie")
public class PersonMovieController {
	@Autowired
	PersonMovieService personMovieService;
	
	@GetMapping("/getAllPersonMovie")
	public @ResponseBody ResponseEntity<List<PersonMovie>> findPersonMovie() {
		return new ResponseEntity<List<PersonMovie>>(personMovieService.findPersonMovie(), HttpStatus.OK);
	}
	
	@GetMapping("/getAllPersonMovieDTO")
	public @ResponseBody ResponseEntity<List<PersonMovieDTO>> findPersonMovieDTO() {
		return new ResponseEntity<List<PersonMovieDTO>>(personMovieService.findPersonMovieDTO(), HttpStatus.OK);
	}
}
