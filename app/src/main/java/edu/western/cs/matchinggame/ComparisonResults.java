package edu.western.cs.matchinggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import edu.western.cs.matchinggame.Model.Animal;
import edu.western.cs.matchinggame.Model.AnimalResult;

public class ComparisonResults extends AppCompatActivity {
    int score;
    int guesses;
    int missed;
    ArrayList<AnimalResult> wrongCats;
    ArrayList<AnimalResult> rightCats;
    ArrayList<AnimalResult> thecats;
    ArrayList<String> wcs;
    ArrayList<String> rcs;
    ArrayList<Animal> allCats = CatData.data2;
    CustomAdapter customAdapter;
    CustomAdapter ustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparison_results);
        score = (int) getIntent().getExtras().get("score");
        guesses = (int) getIntent().getExtras().get("guesses");
        missed = guesses - score;
        wcs = getIntent().getStringArrayListExtra("wrongcats");
        rcs = getIntent().getStringArrayListExtra("rightcats");
//        wrongCats = getWrongCats(wcs);
//        rightCats = getRightCats(rcs);
        thecats = getTheCats(wcs,rcs);
//        Log.d("ddd",wrongCats.toString());
//        Log.d("ddd",rightCats.toString());
        TextView yourScore = findViewById(R.id.your_score);
        TextView catsYouMissed = findViewById(R.id.cats_missed);
        yourScore.setText("your score: "+score+"/"+guesses);
        catsYouMissed.setText("you missed: "+ missed + " animals");


        ListView listView = findViewById(R.id.missed_list);

        customAdapter = new CustomAdapter(ComparisonResults.this, R.layout.activity_results_item, thecats);

        listView.setAdapter(customAdapter);

    }
    public ArrayList<AnimalResult> getTheCats(ArrayList<String> wcs, ArrayList<String> rcs) {
        ArrayList<AnimalResult> rightCats = new ArrayList<>();
        for (int i = 0; i < wcs.size(); i++){
            for (int j = 0; j < allCats.size(); j++){
                if (wcs.get(i).equals(allCats.get(j).getName())){
                    AnimalResult animal1 = new AnimalResult();
                    animal1.setCorrect(false);
                    animal1.setName(allCats.get(j).getName());
                    animal1.setFunfact(allCats.get(j).getFunfact());
                    animal1.setGender(allCats.get(j).getGender());
                    animal1.setImgName(allCats.get(j).getImgName());
                    animal1.setStory(allCats.get(j).getStory());
                    animal1.setNickname(allCats.get(j).getNickname());
                    rightCats.add(animal1);
                }
            }
        }
        for (int i = 0; i < rcs.size(); i++){
            for (int j = 0; j < allCats.size(); j++){
                if (rcs.get(i).equals(allCats.get(j).getName())){
                    AnimalResult animal1 = new AnimalResult();
                    animal1.setCorrect(true);
                    animal1.setName(allCats.get(j).getName());
                    animal1.setFunfact(allCats.get(j).getFunfact());
                    animal1.setGender(allCats.get(j).getGender());
                    animal1.setImgName(allCats.get(j).getImgName());
                    animal1.setStory(allCats.get(j).getStory());
                    animal1.setSpecies(allCats.get(j).getSpecies());
                    animal1.setNickname(allCats.get(j).getNickname());
                    rightCats.add(animal1);
                }
            }
        }
        return rightCats;
    }
//    public ArrayList<AnimalResult> getRightCats(ArrayList<String> rcs) {
//        ArrayList<AnimalResult> rightCats = new ArrayList<>();
//        for (int i = 0; i < rcs.size(); i++){
//            for (int j = 0; j < allCats.size(); j++){
//                if (rcs.get(i).equals(allCats.get(j).getName())){
//                    AnimalResult animal1 = new AnimalResult();
//                    animal1.setCorrect(true);
//                    animal1.setName(allCats.get(j).getName());
//                    animal1.setFunfact(allCats.get(j).getFunfact());
//                    animal1.setGender(allCats.get(j).getGender());
//                    animal1.setImgName(allCats.get(j).getImgName());
//                    animal1.setStory(allCats.get(j).getStory());
//                    animal1.setNickname(allCats.get(j).getNickname());
//                    rightCats.add(animal1);
//                }
//            }
//        }
//        return rightCats;
//    }
//    public ArrayList<AnimalResult> getWrongCats(ArrayList<String> wcs) {
//        ArrayList<AnimalResult> wrongCats = new ArrayList<>();
//
//        for (int i = 0; i < wcs.size(); i++){
//            for (int j = 0; j < allCats.size(); j++){
//                if (wcs.get(i).equals(allCats.get(j).getName())){
//                    AnimalResult animal1 = new AnimalResult();
//                    animal1.setCorrect(false);
//                    animal1.setName(allCats.get(j).getName());
//                    animal1.setFunfact(allCats.get(j).getFunfact());
//                    animal1.setGender(allCats.get(j).getGender());
//                    animal1.setImgName(allCats.get(j).getImgName());
//                    animal1.setStory(allCats.get(j).getStory());
//                    animal1.setNickname(allCats.get(j).getNickname());
//                    wrongCats.add(animal1);
//                }
//            }
//        }
//        return wrongCats;
//    }

    public void onQuitPress(View v) {
        Intent qIntent = new Intent(this, MainActivity.class);
        startActivity(qIntent);

    }
}
