package com.stackroute.spring;

public class Movie
{
    //accessing actor class here
    private Actor actors;

    public Movie(Actor actor) {
        this.actors = actor;
    }

    public void setActor(Actor actor) {
        this.actors = actor;
    }

    public Actor getActor() {
        return actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actors +
                '}';
    }
}
