package org.alfresco;

import org.alfresco.model.Film;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FilmBuilderTest {

    @Test
    public void shouldSetGenres() {
        String genres = "Action|Adventure|Fantasy|Sci-Fi";
        Film.Builder filmBuilder = new Film.Builder();

        Film film = filmBuilder.withGenres(genres).build();

        assertThat(film.getGenres()).containsExactly("Action", "Adventure", "Fantasy", "Sci-Fi");
    }

    @Test
    public void shouldSetPlotKeywords() {
        String keywords = "avatar|future|marine|native|paraplegic";
        Film.Builder filmBuilder = new Film.Builder();

        Film film = filmBuilder.withPlotKeywords(keywords).build();

        assertThat(film.getPlotKeywords()).containsExactly("avatar", "future", "marine", "native", "paraplegic");
    }

}