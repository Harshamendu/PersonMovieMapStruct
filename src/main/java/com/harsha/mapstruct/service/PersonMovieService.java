package com.harsha.mapstruct.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.harsha.mapstruct.dto.PersonMovieDTO;
import com.harsha.mapstruct.mapper.PersonMovieMapper;
import com.harsha.mapstruct.model.PersonMovie;

@Service("personMovieService")
public class PersonMovieService{
	
@Autowired
private PersonMovieMapper personMovieMapper;
	
	public List<PersonMovie> findPersonMovie() {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return Arrays.asList(objectMapper.readValue(new File("src/main/resources/personmovie.json"), PersonMovie[].class));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<PersonMovieDTO> findPersonMovieDTO() {
		List<PersonMovieDTO> resultPMDto = new ArrayList<>();
		this.findPersonMovie().stream().forEach(pm -> {
			resultPMDto.add(personMovieMapper.personmovieToPersonMovieDTO(pm));
		});
		return resultPMDto;
	}

	

	
}
