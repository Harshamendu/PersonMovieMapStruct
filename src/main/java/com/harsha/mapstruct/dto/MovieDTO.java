package com.harsha.mapstruct.dto;

import java.io.Serializable;
import java.util.Date;

import com.harsha.mapstruct.constants.RatedEnum;

import lombok.Data;

@Data
public class MovieDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer movieId;
	private Long imdbId;
	private String title;
	private String storyLine;
	private Date releaseDate;
	private RatedEnum rated;
	
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public Long getImdbId() {
		return imdbId;
	}
	public void setImdbId(Long imdbId) {
		this.imdbId = imdbId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStoryLine() {
		return storyLine;
	}
	public void setStoryLine(String storyLine) {
		this.storyLine = storyLine;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public RatedEnum getRated() {
		return rated;
	}
	public void setRated(RatedEnum rated) {
		this.rated = rated;
	}

	

	
}
