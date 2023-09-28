package com.tcs.library.librarymanagement.repository;

import com.tcs.library.librarymanagement.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
