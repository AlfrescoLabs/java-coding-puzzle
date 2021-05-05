package org.alfresco.model;

import java.util.Arrays;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

/**
 * Model.
 */
public class Film {

    public static final int UNKNOWN = -1;
    public static final String EMPTY_STRING = "";

    private final String colorOrBlackAndWhite;
    private final String directorName;
    private final int numCriticForReviews;
    private final int duration;
    private final long directorFacebookLikes;
    private final long actor3FacebookLikes;
    private final String actor2Name;
    private final long actor1FacebookLikes;
    private final long gross;
    private final String[] genres;
    private final String actor1Name;
    private final String movieTitle;
    private final int numVotedUsers;
    private final long castTotalFacebookLikes;
    private final String actor3Name;
    private final int faceNumberInPoster;
    private final String[] plotKeywords;
    private final String imdbLink;
    private final int numUserForReviews;
    private final String language;
    private final String country;
    private final String contentRating;
    private final long budget;
    private final int titleYear;
    private final long actor2FacebookLikes;
    private final double imdbScore;
    private final double aspectRatio;
    private final long facebookLikes;

    private Film(Builder builder) {
        colorOrBlackAndWhite = builder.colorOrBlackAndWhite;
        directorName = builder.directorName;
        numCriticForReviews = builder.numCriticForReviews;
        duration = builder.duration;
        directorFacebookLikes = builder.directorFacebookLikes;
        actor3FacebookLikes = builder.actor3FacebookLikes;
        actor2Name = builder.actor2Name;
        actor1FacebookLikes = builder.actor1FacebookLikes;
        gross = builder.gross;
        genres = builder.genres;
        actor1Name = builder.actor1Name;
        movieTitle = builder.movieTitle;
        numVotedUsers = builder.numVotedUsers;
        castTotalFacebookLikes = builder.castTotalFacebookLikes;
        actor3Name = builder.actor3Name;
        faceNumberInPoster = builder.faceNumberInPoster;
        plotKeywords = builder.plotKeywords;
        imdbLink = builder.imdbLink;
        numUserForReviews = builder.numUserForReviews;
        language = builder.language;
        country = builder.country;
        contentRating = builder.contentRating;
        budget = builder.budget;
        titleYear = builder.titleYear;
        actor2FacebookLikes = builder.actor2FacebookLikes;
        imdbScore = builder.imdbScore;
        aspectRatio = builder.aspectRatio;
        facebookLikes = builder.facebookLikes;
    }


    public String getColorOrBlackAndWhite() {
        return colorOrBlackAndWhite;
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getNumCriticForReviews() {
        return numCriticForReviews;
    }

    public int getDuration() {
        return duration;
    }

    public long getDirectorFacebookLikes() {
        return directorFacebookLikes;
    }

    public long getActor3FacebookLikes() {
        return actor3FacebookLikes;
    }

    public String getActor2Name() {
        return actor2Name;
    }

    public long getActor1FacebookLikes() {
        return actor1FacebookLikes;
    }

    public long getGross() {
        return gross;
    }

    public String[] getGenres() {
        return genres;
    }

    public String getActor1Name() {
        return actor1Name;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getNumVotedUsers() {
        return numVotedUsers;
    }

    public long getCastTotalFacebookLikes() {
        return castTotalFacebookLikes;
    }

    public String getActor3Name() {
        return actor3Name;
    }

    public int getFaceNumberInPoster() {
        return faceNumberInPoster;
    }

    public String[] getPlotKeywords() {
        return plotKeywords;
    }

    public String getImdbLink() {
        return imdbLink;
    }

    public int getNumUserForReviews() {
        return numUserForReviews;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }

    public String getContentRating() {
        return contentRating;
    }

    public long getBudget() {
        return budget;
    }

    public int getTitleYear() {
        return titleYear;
    }

    public long getActor2FacebookLikes() {
        return actor2FacebookLikes;
    }

    public double getImdbScore() {
        return imdbScore;
    }

    public double getAspectRatio() {
        return aspectRatio;
    }

    public long getFacebookLikes() {
        return facebookLikes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Film film = (Film) o;

        if (numCriticForReviews != film.numCriticForReviews) return false;
        if (duration != film.duration) return false;
        if (directorFacebookLikes != film.directorFacebookLikes) return false;
        if (actor3FacebookLikes != film.actor3FacebookLikes) return false;
        if (actor1FacebookLikes != film.actor1FacebookLikes) return false;
        if (gross != film.gross) return false;
        if (numVotedUsers != film.numVotedUsers) return false;
        if (castTotalFacebookLikes != film.castTotalFacebookLikes) return false;
        if (faceNumberInPoster != film.faceNumberInPoster) return false;
        if (numUserForReviews != film.numUserForReviews) return false;
        if (budget != film.budget) return false;
        if (titleYear != film.titleYear) return false;
        if (actor2FacebookLikes != film.actor2FacebookLikes) return false;
        if (Double.compare(film.imdbScore, imdbScore) != 0) return false;
        if (Double.compare(film.aspectRatio, aspectRatio) != 0) return false;
        if (facebookLikes != film.facebookLikes) return false;
        if (colorOrBlackAndWhite != null ? !colorOrBlackAndWhite.equals(film.colorOrBlackAndWhite) : film.colorOrBlackAndWhite != null)
            return false;
        if (directorName != null ? !directorName.equals(film.directorName) : film.directorName != null) return false;
        if (actor2Name != null ? !actor2Name.equals(film.actor2Name) : film.actor2Name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(genres, film.genres)) return false;
        if (actor1Name != null ? !actor1Name.equals(film.actor1Name) : film.actor1Name != null) return false;
        if (movieTitle != null ? !movieTitle.equals(film.movieTitle) : film.movieTitle != null) return false;
        if (actor3Name != null ? !actor3Name.equals(film.actor3Name) : film.actor3Name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(plotKeywords, film.plotKeywords)) return false;
        if (imdbLink != null ? !imdbLink.equals(film.imdbLink) : film.imdbLink != null) return false;
        if (language != null ? !language.equals(film.language) : film.language != null) return false;
        if (country != null ? !country.equals(film.country) : film.country != null) return false;
        return contentRating != null ? contentRating.equals(film.contentRating) : film.contentRating == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = colorOrBlackAndWhite != null ? colorOrBlackAndWhite.hashCode() : 0;
        result = 31 * result + (directorName != null ? directorName.hashCode() : 0);
        result = 31 * result + numCriticForReviews;
        result = 31 * result + duration;
        result = 31 * result + (int) (directorFacebookLikes ^ (directorFacebookLikes >>> 32));
        result = 31 * result + (int) (actor3FacebookLikes ^ (actor3FacebookLikes >>> 32));
        result = 31 * result + (actor2Name != null ? actor2Name.hashCode() : 0);
        result = 31 * result + (int) (actor1FacebookLikes ^ (actor1FacebookLikes >>> 32));
        result = 31 * result + (int) (gross ^ (gross >>> 32));
        result = 31 * result + Arrays.hashCode(genres);
        result = 31 * result + (actor1Name != null ? actor1Name.hashCode() : 0);
        result = 31 * result + (movieTitle != null ? movieTitle.hashCode() : 0);
        result = 31 * result + numVotedUsers;
        result = 31 * result + (int) (castTotalFacebookLikes ^ (castTotalFacebookLikes >>> 32));
        result = 31 * result + (actor3Name != null ? actor3Name.hashCode() : 0);
        result = 31 * result + faceNumberInPoster;
        result = 31 * result + Arrays.hashCode(plotKeywords);
        result = 31 * result + (imdbLink != null ? imdbLink.hashCode() : 0);
        result = 31 * result + numUserForReviews;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (contentRating != null ? contentRating.hashCode() : 0);
        result = 31 * result + (int) (budget ^ (budget >>> 32));
        result = 31 * result + titleYear;
        result = 31 * result + (int) (actor2FacebookLikes ^ (actor2FacebookLikes >>> 32));
        temp = Double.doubleToLongBits(imdbScore);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(aspectRatio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (facebookLikes ^ (facebookLikes >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Film{" +
                "movieTitle='" + movieTitle + '\'' +
                ", titleYear=" + titleYear +
                '}';
    }

    public static class Builder {
        private String colorOrBlackAndWhite;
        private String directorName;
        private int numCriticForReviews;
        private int duration;
        private long directorFacebookLikes;
        private long actor3FacebookLikes;
        private String actor2Name;
        private long actor1FacebookLikes;
        private long gross;
        private String[] genres;
        private String actor1Name;
        private String movieTitle;
        private int numVotedUsers;
        private long castTotalFacebookLikes;
        private String actor3Name;
        private int faceNumberInPoster;
        private String[] plotKeywords;
        private String imdbLink;
        private int numUserForReviews;
        private String language;
        private String country;
        private String contentRating;
        private long budget;
        private int titleYear;
        private long actor2FacebookLikes;
        private double imdbScore;
        private double aspectRatio;
        private long facebookLikes;

        public Builder() {
            colorOrBlackAndWhite = "Color";
            directorName = EMPTY_STRING;
            numCriticForReviews = UNKNOWN;
            duration = UNKNOWN;
            directorFacebookLikes = UNKNOWN;
            actor3FacebookLikes = UNKNOWN;
            actor2Name = EMPTY_STRING;
            actor1FacebookLikes = UNKNOWN;
            gross = UNKNOWN;
            genres = new String[0];
            actor1Name = EMPTY_STRING;
            movieTitle = EMPTY_STRING;
            numVotedUsers = UNKNOWN;
            castTotalFacebookLikes = UNKNOWN;
            actor3Name = EMPTY_STRING;
            faceNumberInPoster = UNKNOWN;
            plotKeywords = new String[0];
            imdbLink = EMPTY_STRING;
            numUserForReviews = UNKNOWN;
            language = EMPTY_STRING;
            country = EMPTY_STRING;
            contentRating = EMPTY_STRING;
            budget = UNKNOWN;
            titleYear = UNKNOWN;
            actor2FacebookLikes = UNKNOWN;
            imdbScore = UNKNOWN;
            aspectRatio = UNKNOWN;
            facebookLikes = UNKNOWN;
        }
        
        public Builder withColorOrBlackOrWhite(String colorOrBlackAndWhite) {
            assert colorOrBlackAndWhite != null;
            this.colorOrBlackAndWhite = colorOrBlackAndWhite;
            return this;
        }

        public Builder withDirectorName(String directorName) {
            assert directorName != null;
            this.directorName = directorName;
            return this;
        }

        public Builder withNumCriticsForReviews(int numCriticForReviews) {
            this.numCriticForReviews = numCriticForReviews;
            return this;
        }

        public Builder withNumCriticsForReviews(String numberCriticsForReviews) {
            return withNumCriticsForReviews(asInteger(numberCriticsForReviews));
        }

        public Builder withDuration(int duration) {
            this.duration = duration;
            return this;
        }

        public Builder withDuration(String duration) {
            return withDuration(asInteger(duration));
        }

        public Builder withDirectorFacebookLikes(long facebookLikes) {
            this.directorFacebookLikes = facebookLikes;
            return this;
        }

        public Builder withDirectorFacebookLikes(String facebookLikes) {
            return withDirectorFacebookLikes(asLong(facebookLikes));
        }

        public Builder withActor3FacebookLikes(long facebookLikes) {
            this.actor3FacebookLikes = facebookLikes;
            return this;
        }

        public Builder withActor3FacebookLikes(String facebookLikes) {
            return withActor3FacebookLikes(asLong(facebookLikes));
        }

        public Builder withActor2Name(String actor2Name) {
            assert actor2Name != null;
            this.actor2Name = actor2Name;
            return this;
        }

        public Builder withActor1FacebookLikes(long facebookLikes) {
            this.actor1FacebookLikes = facebookLikes;
            return this;
        }

        public Builder withActor1FacebookLikes(String facebookLikes) {
            return withActor1FacebookLikes(asLong(facebookLikes));
        }

        public Builder withGross(long gross) {
            this.gross = gross;
            return this;
        }

        public Builder withGross(String gross) {
            return withGross(asLong(gross));
        }

        public Builder withGenres(String[] genres) {
            assert genres != null;
            this.genres = genres;
            return this;
        }

        public Builder withGenres(String genres) {
            return withGenres(asArray(genres));
        }

        public Builder withActor1Name(String actor1Name) {
            assert actor1Name != null;
            this.actor1Name = actor1Name;
            return this;
        }

        public Builder withMovieTitle(String movieTitle) {
            assert movieTitle != null;
            this.movieTitle = movieTitle.trim();
            return this;
        }

        public Builder withNumVotedUsers(int numVotedUsers) {
            this.numVotedUsers = numVotedUsers;
            return this;
        }

        public Builder withNumVotedUsers(String numVotedUsers) {
            return withNumVotedUsers(asInteger(numVotedUsers));
        }

        public Builder withCastTotalFacebookLikes(long facebookLikes) {
            this.castTotalFacebookLikes = facebookLikes;
            return this;
        }

        public Builder withCastTotalFacebookLikes(String facebookLikes) {
            return withCastTotalFacebookLikes(asLong(facebookLikes));
        }

        public Builder withActor3Name(String actor3Name) {
            assert actor3Name != null;
            this.actor3Name = actor3Name;
            return this;
        }

        public Builder withFaceNumberInPoster(int faceNumberInPoster) {
            this.faceNumberInPoster = faceNumberInPoster;
            return this;
        }

        public Builder withFaceNumberInPoster(String faceNumberInPoster) {
            return withFaceNumberInPoster(asInteger(faceNumberInPoster));
        }

        public Builder withPlotKeywords(String[] plotKeywords) {
            assert plotKeywords != null;
            this.plotKeywords = plotKeywords;
            return this;
        }

        public Builder withPlotKeywords(String plotKeywords) {
            return withPlotKeywords(asArray(plotKeywords));
        }

        public Builder withMovieIMDBLink(String imdbLink) {
            assert imdbLink != null;
            this.imdbLink = imdbLink;
            return this;
        }

        public Builder withNumUsersForReviews(int numUserForReviews) {
            this.numUserForReviews = numUserForReviews;
            return this;
        }

        public Builder withNumUserForReviews(String numUserForReviews) {
            return withNumUsersForReviews(asInteger(numUserForReviews));
        }

        public Builder withLanguage(String language) {
            assert language != null;
            this.language = language;
            return this;
        }

        public Builder withCountry(String country) {
            assert country != null;
            this.country = country;
            return this;
        }

        public Builder withContentRating(String contentRating) {
            assert contentRating != null;
            this.contentRating = contentRating;
            return this;
        }

        public Builder withBudget(long budget) {
            this.budget = budget;
            return this;
        }

        public Builder withBudget(String budget) {
            return withBudget(asLong(budget));
        }

        public Builder withTitleYear(int titleYear) {
            this.titleYear = titleYear;
            return this;
        }

        public Builder withTitleYear(String titleYear) {
            return withTitleYear(asInteger(titleYear));
        }

        public Builder withActor2FacebookLikes(long facebookLikes) {
            this.actor2FacebookLikes = facebookLikes;
            return this;
        }

        public Builder withActor2FacebookLikes(String facebookLikes) {
            return withActor2FacebookLikes(asLong(facebookLikes));
        }

        public Builder withIMDBScore(double imdbScore) {
            this.imdbScore = imdbScore;
            return this;
        }

        public Builder withIMDBScore(String imdbScore) {
            return withIMDBScore(asDouble(imdbScore));
        }

        public Builder withAspectRatio(double aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }

        public Builder withAspectRatio(String aspectRatio) {
            return withAspectRatio(asDouble(aspectRatio));
        }

        public Builder withMovieFacebookLikes(long facebookLikes) {
            this.facebookLikes = facebookLikes;
            return this;
        }

        public Builder withMovieFacebookLikes(String facebookLikes) {
            return withMovieFacebookLikes(asLong(facebookLikes));
        }

        private int asInteger(String input) {
            return (input == null || input.length() == 0) ? -1 : parseInt(input);
        }

        private long asLong(String input) {
            return (input == null || input.length() == 0) ? -1 : parseLong(input);
        }

        private double asDouble(String imdbScore) {
            return (imdbScore == null || imdbScore.length() == 0) ? -1.0 : parseDouble(imdbScore);
        }

        private String[] asArray(String input) {
            return input.split("\\|");
        }
        
        public Film build() {
            return new Film(this);
        }
    }

}
