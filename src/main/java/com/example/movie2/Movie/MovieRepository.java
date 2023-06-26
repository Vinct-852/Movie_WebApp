package com.example.movie2.Movie;

import com.example.movie2.Movie.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
//    @Query
    Optional<Movie> findMovieByImdbId(String imdbId);
}