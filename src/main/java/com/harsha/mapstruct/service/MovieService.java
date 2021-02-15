package com.harsha.mapstruct.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.harsha.mapstruct.dto.MovieDTO;
import com.harsha.mapstruct.mapper.MovieMapper;
import com.harsha.mapstruct.model.Movie;

@Service("movieService")
public class MovieService {

	public List<Movie> findAllMovies() {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return Arrays.asList(objectMapper.readValue(new File("src/main/resources/movies.json"), Movie[].class));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<MovieDTO> findAllMoviesDTO() {
		List<MovieDTO> resultDto = new ArrayList<>();
		this.findAllMovies().stream()
			.forEach(s -> resultDto.add(MovieMapper.INSTANCE.movieToMovieDTO(s)));
		
		return resultDto;

	}
}
