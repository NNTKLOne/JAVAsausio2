package org.example.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Chat {
    private int id;
    private List<Comment> messages;

    public Chat(int id, List<Comment> messages) {
        this.id = id;
        this.messages = messages;
    }

    public Chat(List<Comment> messages) {
        this.messages = messages;
    }
}
