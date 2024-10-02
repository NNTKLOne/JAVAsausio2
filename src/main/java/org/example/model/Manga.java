package org.example.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Manga extends Publication {
    private String illustrator;
    private String originalLanguage;
    private int volumeCount;
    private int chapterCount;
    private List<String> genres;

    public Manga(int id, String title, String author, String illustrator, String originalLanguage, int volumeCount, int chapterCount, List<String> genres) {
        super(id, title, author);
        this.illustrator = illustrator;
        this.originalLanguage = originalLanguage;
        this.volumeCount = volumeCount;
        this.chapterCount = chapterCount;
        this.genres = genres;
    }

    public Manga(String title, String author, String illustrator, String originalLanguage, int volumeCount, int chapterCount, List<String> genres) {
        super(title, author);
        this.illustrator = illustrator;
        this.originalLanguage = originalLanguage;
        this.volumeCount = volumeCount;
        this.chapterCount = chapterCount;
        this.genres = genres;
    }
}
