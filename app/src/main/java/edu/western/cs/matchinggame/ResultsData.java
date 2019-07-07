package edu.western.cs.matchinggame;

import java.util.ArrayList;

import edu.western.cs.matchinggame.Model.GameResult;

public class ResultsData {
    private ArrayList<GameResult> myResults;

    public void newResult(GameResult myResult){
        this.myResults.add(myResult);
    }
}
