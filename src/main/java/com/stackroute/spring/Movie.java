package com.stackroute.spring;

public class Movie
{
    //actor object in movie class
    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void acting()
    {
        System.out.println(actor.getName());
        System.out.println(actor.getAge());
        System.out.println(actor.getGender());

    }
}
