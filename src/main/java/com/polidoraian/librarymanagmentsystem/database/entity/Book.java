package com.polidoraian.librarymanagmentsystem.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode()
@Entity
@Table(name = "books")
public class Book {
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    
    @Column(name = "title", nullable = false)
    private String title;
    
    @Column(name = "author", nullable = false)
    private String author;
    
    @Column(name = "isbn", unique = true, nullable = false)
    private Integer isbn;
    
    @Column(name = "format", nullable = false)
    private String format;
    
    @Column(name = "summary", nullable = false)
    private String summary;
    
    @Column(name = "publisher", nullable = false)
    private String publisher;
    
    @Column(name = "language", nullable = false)
    private String language;
    
    @Column(name = "genre", nullable = false)
    private String genre;
    
    @Column(name = "num_pages", nullable = false)
    private Integer numPages;

}
