package edu.western.cs.matchinggame.Model;

import java.util.ArrayList;

public class GameResult {
    private String dateTime;
    private int numberOfGuesses;
    private int correctGuesses;
    private ArrayList<Animal> missedCats;
    private ArrayList<Animal> correctCats;

    public GameResult(int numberOfGuesses, int correctGuesses, ArrayList<Animal> missedCats, ArrayList<Animal> correctCats){
        this.numberOfGuesses = numberOfGuesses;
        this.correctGuesses = correctGuesses;
        this.missedCats = missedCats;
        this.correctCats = correctCats;
    }

    public String getDateTime() {
        return dateTime;
    }
    public void setDateTime(String dateTime){
        this.dateTime = dateTime;
    }
    public int getNumberOfGuesses(){
        return numberOfGuesses;
    }
    public void setNumberOfGuesses(int numberOfGuesses){
        this.numberOfGuesses = numberOfGuesses;
    }
    public int getCorrectGuesses(){
        return correctGuesses;
    }
    public void setCorrectGuesses(int correctGuesses){
        this.correctGuesses = correctGuesses;
    }

    public ArrayList<Animal> getMissedCats() {
        return missedCats;
    }

    public void setMissedCats(ArrayList<Animal> missedCats) {
        this.missedCats = missedCats;
    }
    public void addMissedCat(Animal missedCat) {
        this.missedCats.add(missedCat);
    }

    public ArrayList<Animal> getCorrectCats() {
        return correctCats;
    }

    public void setCorrectCats(ArrayList<Animal> correctCats) {
        this.correctCats = correctCats;
    }
    public void addCorrectCat(Animal rightCat){
        this.correctCats.add(rightCat);
    }
}
