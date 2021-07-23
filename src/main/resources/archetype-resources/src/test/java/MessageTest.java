package io.github.kilathaar;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class MessageTest {

    @Nested
    class During_instantiation {

        @Test
        void should_cast_exception_when_text_is_null() {
            assertThatThrownBy(() -> new Message(null)).isInstanceOf(NullPointerException.class);
        }

        @Test
        void should_cast_exception_when_text_is_empty() {
            assertThatThrownBy(() -> new Message("")).isInstanceOf(IllegalArgumentException.class);
        }

        @Test
        void should_cast_exception_when_text_is_only_spaces() {
            assertThatThrownBy(() -> new Message("   ")).isInstanceOf(IllegalArgumentException.class);
        }
    }

    @Test
    void should_return_Hello() {
        assertThat(new Message("Hello").text()).isEqualTo("Hello");
    }

    @Test
    void should_return_World() {
        assertThat(new Message("World").text()).isEqualTo("World");
    }
}
