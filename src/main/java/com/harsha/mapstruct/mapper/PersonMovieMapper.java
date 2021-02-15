package com.harsha.mapstruct.mapper;

import org.mapstruct.Mapper;

import com.harsha.mapstruct.dto.PersonMovieDTO;
import com.harsha.mapstruct.model.PersonMovie;

@Mapper(componentModel = "spring")
public interface PersonMovieMapper {

	PersonMovieDTO personmovieToPersonMovieDTO(PersonMovie movie);
}
