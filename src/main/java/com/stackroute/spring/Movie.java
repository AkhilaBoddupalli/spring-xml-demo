package com.stackroute.spring;

public class Movie
{
    private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }
    public void acting()
    {
        System.out.println("Actor name is "+actor.getName()+" actor gender is "+actor.getGender()+" actor age is "+actor.getAge());
    }
}
