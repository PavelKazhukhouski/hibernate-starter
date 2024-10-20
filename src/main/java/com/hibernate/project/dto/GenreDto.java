package com.hibernate.project.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GenreDto {
    private Long id;
    private Long tmdbId;
    private String name;
}
