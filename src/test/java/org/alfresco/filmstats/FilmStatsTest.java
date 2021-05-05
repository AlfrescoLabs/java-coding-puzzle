package org.alfresco.filmstats;

import org.alfresco.MovieRepository;
import org.alfresco.model.Film;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * These are the answers for puzzle one. Complete the code in FilmStats.java to make these tests pass.
 */
public class FilmStatsTest {

    private final MovieRepository movieRepository;

    public FilmStatsTest() throws FileNotFoundException {
        this.movieRepository = new MovieRepository(new FileReader("movie-data.json"));
    }

    @Test
    public void shouldReturnTop10HighestGrossingFilms() {
        FilmStats filmStats = new FilmStats(movieRepository);

        List<Film> films = filmStats.top10HighestGrossingFilms();

        assertThat(asListOfFilmNames(films)).containsExactly(
                "Avatar",
                "Titanic",
                "Jurassic World",
                "The Avengers",
                "The Avengers",
                "The Dark Knight",
                "Star Wars: Episode I - The Phantom Menace",
                "Star Wars: Episode IV - A New Hope",
                "Avengers: Age of Ultron",
                "The Dark Knight Rises"
        );
    }

    @Test
    public void shouldReturnTop10ValueForMoneyFilms() {
        FilmStats filmStats = new FilmStats(movieRepository);

        List<Film> films = filmStats.top10ValueForMoneyFilms();

        assertThat(asListOfFilmNames(films)).containsExactly(
                "Paranormal Activity",
                "Tarnation",
                "The Blair Witch Project",
                "The Brothers McMullen",
                "The Texas Chain Saw Massacre",
                "The Texas Chain Saw Massacre",
                "El Mariachi",
                "The Gallows",
                "Super Size Me",
                "Halloween"
        );
    }

    @Test
    public void shouldReturnActorWhoHasAppearedInTheMostFilms() {
        FilmStats filmStats = new FilmStats(movieRepository);

        String actor = filmStats.actorWhoHasAppearedInTheMostFilms();

        assertThat(actor).isEqualTo("Robert De Niro");
    }

    private List<String> asListOfFilmNames(List<Film> films) {
        return films.stream().map(Film::getMovieTitle).collect(toList());
    }

}