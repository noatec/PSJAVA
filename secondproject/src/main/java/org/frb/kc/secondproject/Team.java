package org.frb.kc.secondproject;

import java.util.Objects;

/**
 * Hello world!
 *
 */
public class Team {
    //coach
    //owner
    //sport
    //shouldn't wins and losses be in a season?
    //roster  == Collection of players
    //defense == collection of players
    //offense == same ^
    //perhaps a for loop or while to filter out player by offense or defense


// member variables, also called attributes
    //TODO: lock the member variables
    int losses;
    String name;
    int size;
    int wins;


    public Team(String name) {
        // equal? null pointer exception
        // mizra
        if ("".equals(name)) {  //or (name.equals("")) or ("".equals(name)) or ("".equals(name)  || name == null )
            throw new IllegalArgumentException("No blank strings allowed");
        } else if (name == null) {
            throw new NullPointerException("No null names allowed");
        }
        this.name = name;
    }

    //we will add a player
    // player will have a position
    // based on position are they offense or defense

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return name.equals(team.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // constructor
    // assign loss name wins
    // main method
    // can we do a test?

}
