package org.example.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Book extends Publication{
    private String publisher;
    private String isbn;
    private String originalLanguage;
    private String summary;
    private int pageCount;
    private int publicationYear;
    private List<String> genres;

    public Book(int id, String title, String author, String publisher, String isbn, String originalLanguage, String summary, int pageCount, int publicationYear, List<String> genres) {
        super(id, title, author);
        this.publisher = publisher;
        this.isbn = isbn;
        this.originalLanguage = originalLanguage;
        this.summary = summary;
        this.pageCount = pageCount;
        this.publicationYear = publicationYear;
        this.genres = genres;
    }

    public Book(String title, String author, String publisher, String isbn, String originalLanguage, String summary, int pageCount, int publicationYear, List<String> genres) {
        super(title, author);
        this.publisher = publisher;
        this.isbn = isbn;
        this.originalLanguage = originalLanguage;
        this.summary = summary;
        this.pageCount = pageCount;
        this.publicationYear = publicationYear;
        this.genres = genres;
    }
}
