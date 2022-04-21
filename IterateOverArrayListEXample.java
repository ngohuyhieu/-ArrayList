package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayListEXample {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Gmae Of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison break");

        System.out.println("=== Iterate using Java 8 forEach and lambda ===");
        tvShows.forEach(tvShow -> {
            System.out.println(tvShows);
        });
        System.out.println("\n=== Iterate using an iterator() ===");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()){
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }
        System.out.println("\n=== Iterate using simple for-each loop ===");
        for(String tvshow: tvShows){
            System.out.println(tvshow);
        }
        System.out.println("\n=== Iterate using for loop with index ===");
        for (int i = 0; i < tvShows.size(); i++){
            System.out.println(tvShows.get(i));
        }
    }
}
