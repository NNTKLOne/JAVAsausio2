package org.example.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Periodical extends Publication {
    private int issueNumber;
    private LocalDate publicationDate;
    private String editor;
    private String publisher;

    public Periodical(int id, String title, String author, int issueNumber, LocalDate publicationDate, String editor, String publisher) {
        super(id, title, author);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
        this.editor = editor;
        this.publisher = publisher;
    }

    public Periodical(String title, String author, int issueNumber, LocalDate publicationDate, String editor, String publisher) {
        super(title, author);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
        this.editor = editor;
        this.publisher = publisher;
    }
}
