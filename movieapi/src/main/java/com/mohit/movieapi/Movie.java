package com.mohit.movieapi;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data //takes care of getters and setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId,title,releaseDate,trailerLink,poster;
    private List<String> genre, backdrop;
    @DocumentReference
    private List<Review> reviewId;

    public Movie(String imdbId, String title, String releaseDate, String trailerLink, String poster, List<String> backdrop, List<String> genre) {
        this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.backdrop = backdrop;
        this.genre = genre;
    }

}
