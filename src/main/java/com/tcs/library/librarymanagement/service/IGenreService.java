package com.tcs.library.librarymanagement.service;

import com.tcs.library.librarymanagement.entity.Genre;

import java.util.List;

public interface IGenreService {
    List<Genre> getGenres();

    Genre getGenre(Long id);

    Genre updateGenre(Genre genre);

    void deleteGenre(Long id);

    Genre createGenre(Genre genre);
}
