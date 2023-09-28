package com.tcs.library.librarymanagement.controller;

import com.tcs.library.librarymanagement.entity.Book;
import com.tcs.library.librarymanagement.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path ="/api/books")
public class BookController {

    @Autowired
    IBookService bookService;

    @GetMapping
    public List<Book> getBooks() {
        return bookService.getBooks();
    }


    /**
     * This Api is used to get the book on id
     *
     * @param id
     * @return Book
     */
    @GetMapping(path ="/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookService.getBook(id);
    }

    /**
     * This API is used to create the book
     *
     * @param book
     * @return Book
     */
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    /**
     * This API is used to delete the bool
     *
     * @param id
     */
    @DeleteMapping(path ="/{id}")
    public void deleteBook(@RequestParam Long id) {
        bookService.deleteBook(id);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

}
