package com.mike;

/**
 * Created by Mike on 11/17/2015.
 */
public class Snake {
    private String species;
    private int venomRating;

    public Snake (String snake, int venom){
        this.species = snake;
        this.venomRating = venom;
    }

    public String getSpecies() {return species;}
    public void setSpecies(String species) {this.species = species;}
    public double getVenomRating() {return venomRating;}
    public void setVenomRating(int venomRating) {this.venomRating = venomRating;
    }

    public String toString() {
        return (this.species + ", " + "venom: " + this.venomRating);
    }
}
