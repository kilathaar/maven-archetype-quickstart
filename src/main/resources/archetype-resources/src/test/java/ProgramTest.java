package io.github.kilathaar;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class ProgramTest {
    @Nested
    class During_instantiation {
        @Test
        void should_cast_exception_when_message_is_null() {
            assertThatThrownBy(() -> new Program(null)).isInstanceOf(NullPointerException.class);
        }
    }

    @Test
    void should_display_message() {
        var message = mock(Message.class);

        var program = new Program(message);
        program.displayMessage();

        verify(message).text();
    }
}
