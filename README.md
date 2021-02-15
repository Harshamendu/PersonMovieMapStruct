# PersonMovieMapStruct
# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.2/maven-plugin/reference/html/#build-image)

### Reference URLS used

* https://mapstruct.org/documentation/stable/reference/html/
* https://stackabuse.com/guide-to-mapstruct-in-java-advanced-mapping-library/
* https://mapstruct.org/news/2020-09-28-mapstruct-1_4_0_Final-is-out/

### APIs

##### Person API
 * http://localhost:8080/personMovie/getAllPersonMovie
 	** Returns all Person with associated movies
 * http://localhost:8080/personMovie/getAllPersonMovieDTO
 	** Returns all Person with associated proxy movies where mappers are spring beans
  https://github.com/Harshamendu/PersonMovieMapStruct/blob/master/PersonMovieMapper.png
 
##### Movie API
 * http://localhost:8080/movie/getAllMovies
  	** Returns all movies
 * http://localhost:8080/movie/getAllMoviesDTO
 	** Returns all movie DTO
  https://github.com/Harshamendu/PersonMovieMapStruct/blob/master/MovieMapper.png
