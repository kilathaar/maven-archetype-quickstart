package io.github.kilathaar;

import java.util.Objects;

public class Message {
    private final String text;

    public Message(String text) {
        Objects.requireNonNull(text);
        if (text.trim().isEmpty()) {
            throw new IllegalArgumentException("Message must not be empty");
        }
        this.text = text;
    }

    public String text() {
        return text;
    }
}
