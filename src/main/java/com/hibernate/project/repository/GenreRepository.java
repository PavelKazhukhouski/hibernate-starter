package com.hibernate.project.repository;


import com.hibernate.project.model.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreRepository {
    List<Genre> findAll();
    Optional<Genre> findById(Long id);
    Genre create(Genre genre);
    Genre update(Genre genre);
    void deleteById(Long id);

}
