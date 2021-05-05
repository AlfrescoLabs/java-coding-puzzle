package org.alfresco.model;

public class DirectorAndLeadingActorPair {

    private final String director;
    private final String leadingActor;

    public DirectorAndLeadingActorPair(String director, String leadingActor) {
        this.director = director;
        this.leadingActor = leadingActor;
    }

    public String getDirector() {
        return director;
    }

    public String getLeadingActor() {
        return leadingActor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DirectorAndLeadingActorPair that = (DirectorAndLeadingActorPair) o;

        if (director != null ? !director.equals(that.director) : that.director != null) return false;
        return leadingActor != null ? leadingActor.equals(that.leadingActor) : that.leadingActor == null;

    }

    @Override
    public int hashCode() {
        int result = director != null ? director.hashCode() : 0;
        result = 31 * result + (leadingActor != null ? leadingActor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DirectorAndLeadingActorPair{" +
                "director='" + director + '\'' +
                ", leadingActor='" + leadingActor + '\'' +
                '}';
    }
}

