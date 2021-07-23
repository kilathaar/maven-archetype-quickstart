package io.github.kilathaar;

import java.util.Objects;

public class Program {
    private final Message message;

    public Program(Message message) {
		Objects.requireNonNull(message);
        this.message = message;
    }

    public static void main(String[] args) {
        var message = new Message("Hello World!");
        var program = new Program(message);
        System.out.println(program.displayMessage());
    }

    public String displayMessage() {
        return message.text();
    }
}
