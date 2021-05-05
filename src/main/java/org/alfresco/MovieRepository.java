package org.alfresco;

import org.alfresco.model.Film;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private final Reader reader;

    public MovieRepository(Reader reader) {
        this.reader = reader;
    }

    public List<Film> allFilms() {
        Gson gson = new GsonBuilder().setPrettyPrinting()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        Type listType = new TypeToken<ArrayList<Film>>(){}.getType();
        return gson.fromJson(reader, listType);
    }

}
