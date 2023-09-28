package com.tcs.library.librarymanagement.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name ="BOOK")
@Data
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String ISBN;
    @ManyToOne
    private Author author;
    @Enumerated(EnumType.STRING)
    private BookStatus status;
}

