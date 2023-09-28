package com.tcs.library.librarymanagement.controller;

import com.tcs.library.librarymanagement.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tcs.library.librarymanagement.service.IAuthorService;

import java.util.List;

@RestController
@RequestMapping(path ="/api/authors")
public class AuthorController {

    @Autowired
    IAuthorService authorService;

    @GetMapping
    public List<Author> getAuthors() {
        return authorService.getAuthors();
    }

    /**
     *
     * @param id
     * @return Author
     */
    @GetMapping("/{id}")
    public Author getAuthor(@PathVariable Long id) {
        return authorService.getAuthor(id);
    }

    /**
     *
     * @param author
     * @return Author
     */
    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return authorService.createAuthor(author);
    }

    /**
     *
     * @param id
     */
    @DeleteMapping("/{id}")
    public void deleleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
    }

    /**
     *
     * @param author
     * @return Author
     */
    @PutMapping
    public Author updateAuthor(@RequestBody Author author) {
        return authorService.updateAuthor(author);
    }

}
