package org.alfresco.filmstats;

import org.alfresco.MovieRepository;
import org.alfresco.model.DirectorAndLeadingActorPair;
import org.alfresco.model.Film;

import java.util.List;

import static java.util.Collections.emptyList;

/**
 * Please complete your code for question one here.
 */
public class FilmStats {

    private final MovieRepository movieRepository;

    public FilmStats(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Film> top10HighestGrossingFilms() {
        return emptyList();
    }

    public List<Film> top10ValueForMoneyFilms() {
        return emptyList();
    }

    public String actorWhoHasAppearedInTheMostFilms() {
        return "Unknown";
    }

    public DirectorAndLeadingActorPair mostSuccessfulDirectorAndLeadingActorPair() {
        return null;
    }

}
