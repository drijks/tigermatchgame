package edu.western.cs.matchinggame;

import android.util.Log;

import edu.western.cs.matchinggame.Model.Animal;

import java.util.List;
import java.util.Random;

public class GameState {

    public Animal cat1, cat2, correctCat;
    public Animal[] cats = {cat1,cat2};
    public boolean guessPhase;
    Random r = new Random();

    public GameState(){
        //Log.d("ddd","*****game state initializing...");
        //cat1 = CatData.random();
        //Log.d("ddd","**cat1="+cat1.getName());

        /*
        do {
            cat2 = CatData.random();
        } while (cat2.getName() == cat1.getName()); */

       List<Animal> list = CatData.pickTwoRandom();
//       Log.d("ddd","*****size="+list.size());

       cat1=list.get(0);
       cat2=list.get(1);

       boolean whichCat = r.nextBoolean();
       if (whichCat){
           correctCat = cat1;
       }
       else {
           correctCat = cat2;
       }

        guessPhase = true;
    }

    public boolean guess(String imgName){
        guessPhase = false;
        return (imgName == correctCat.getImgName());
    }

}
