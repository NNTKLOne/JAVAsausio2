package org.example.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Comment {
    private int id;
    private String title;
    private String body;
    private LocalDateTime timestamp;
    private List<Comment> replies;
    private User user;

    public Comment(int id, String title, String body, LocalDateTime timestamp, List<Comment> replies, User user) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.timestamp = timestamp;
        this.replies = replies;
        this.user = user;
    }

    public Comment(String title, String body, LocalDateTime timestamp, List<Comment> replies, User user) {
        this.title = title;
        this.body = body;
        this.timestamp = timestamp;
        this.replies = replies;
        this.user = user;
    }
}