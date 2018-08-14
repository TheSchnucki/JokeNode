package com.udacity.gradle.builditbigger.worldofjokes;

import java.util.Random;

public class JokeProvider {
    private static String[] jokes = {
            "Can a kangaroo jump higher than a house? \n Of course, a house doesn't jump at all.",
            "I have a lot in common with post-first world war Germany. We both went through a great depression in our 20s. Then in our 30s a nice man came along. Great facial hair. I'm hoping for the best. ",
            "\"Never Apologise! Never Explain!\" Sorry, that's my motto.",
            "What's the difference between a well dressed man on a bike and a poorly dressed man on a unicycle? \n Attire.",
            "How do you think the unthinkable? With an itheberg."
    };

    public static String getJoke () {
        String returnJoke = jokes[new Random().nextInt(jokes.length)];
        return returnJoke;
    }
}