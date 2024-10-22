package com.hibernate.project.controller;

import com.hibernate.project.dto.GenreDto;
import com.hibernate.project.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenreController {

    private final GenreService genreService;

    @Autowired
    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping
    public List<GenreDto> findAll() {
        return genreService.findAll();
    }

    @GetMapping("/{id}")
    public GenreDto findById(@PathVariable("id") Long id) {
        return genreService.findById(id);
    }

    @PostMapping
    public GenreDto create(@RequestBody GenreDto genreDTO) {
        return genreService.create(genreDTO);
    }

    @PutMapping("/{id}")
    public GenreDto update(@PathVariable("id") long id, @RequestBody GenreDto genreDto) {
        return genreService.update(id, genreDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") long id) {
        genreService.deleteById(id);
    }
}

