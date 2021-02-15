package com.harsha.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.harsha.mapstruct.dto.MovieDTO;
import com.harsha.mapstruct.model.Movie;

@Mapper
public interface MovieMapper {

	MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);

	@Mapping(target = "movieId", source = "movie.id")
	@Mapping(target = "releaseDate", source = "releaseDate", dateFormat = "dd/MM/yyyy")
	MovieDTO movieToMovieDTO(Movie movie);

}
