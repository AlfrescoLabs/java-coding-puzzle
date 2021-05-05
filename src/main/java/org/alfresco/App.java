package org.alfresco;

import org.alfresco.model.Film;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) throws IOException {
        List<Film> films = new MovieRepository(new FileReader("movie-data.json")).allFilms();

        System.out.println(films);
    }
}
