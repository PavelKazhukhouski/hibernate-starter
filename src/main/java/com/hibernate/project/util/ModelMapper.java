package com.hibernate.project.util;


import com.hibernate.project.dto.GenreDto;
import com.hibernate.project.model.Genre;

public class ModelMapper {

        public static GenreDto toGenreDto(Genre genre) {
            return GenreDto.builder()
                    .id(genre.getId())
                    .tmdbId(genre.getTmdbId())
                    .name(genre.getName())
                    .build();
        }

        public static Genre toGenre(GenreDto genreDTO) {
            return Genre.builder()
                    .id(genreDTO.getId())
                    .tmdbId(genreDTO.getTmdbId())
                    .name(genreDTO.getName())
                    .build();
        }

//    public static MovieDto toMovieDto(Movie movie) {
//        return MovieDto.builder()
//                .id(movie.getId())
//                .tmdbId(movie.getTmdbId())
//                .name(movie.getName())
//                .genreId(movie.getGenreId())
//                .releaseDate(movie.getReleaseDate())
//                .rating(movie.getRating())
//                .overview(movie.getOverview())
//                .originalLanguage(movie.getOriginalLanguage())
//                .build();
//    }
//
//    public static Movie toMovie(MovieDto movieDto) {
//        return Movie.builder()
//                .id(movieDto.getId())
//                .tmdbId(movieDto.getTmdbId())
//                .name(movieDto.getName())
//                .genreId(movieDto.getGenreId())
//                .releaseDate(movieDto.getReleaseDate())
//                .rating(movieDto.getRating())
//                .overview(movieDto.getOverview())
//                .originalLanguage(movieDto.getOriginalLanguage())
//                .build();
//    }

}
