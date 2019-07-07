package edu.western.cs.matchinggame;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;

import java.util.ArrayList;

import edu.western.cs.matchinggame.Model.Animal;
import edu.western.cs.matchinggame.Model.GameResult;


public class ComparisonGame extends AppCompatActivity {


    public int score, guesses;
    public GameState state;
    public GameResult result;
    public ArrayList<String> rcs;
    public ArrayList<String> wcs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparison_game);

        score = (int) getIntent().getExtras().get("score");
        guesses = (int) getIntent().getExtras().get("guesses");

        wcs = getIntent().getStringArrayListExtra("wrongcats");

        rcs = getIntent().getStringArrayListExtra("rightcats");

        Button nexter = findViewById(R.id.next_button);
        nexter.setVisibility(View.INVISIBLE);

        state = new GameState();
        ImageButton leftPic = findViewById(R.id.comparisonLeftImage);
        ImageButton rightPic = findViewById(R.id.comparisonRightImage);
        TextView prompt = findViewById(R.id.comparisonDescription);
        TextView scoreCount = findViewById(R.id.scoreText);
        scoreCount.setText("You've guessed " + score + " out of " + guesses + " animals correctly");


        prompt.setText("Which one is " + state.correctCat.getName() + "?");
        // IMPORTANT
        leftPic.setImageResource(state.cat1.getImg(this));
        // PICTURES NEED TO BE IN THE FORM OF INT ADDRESSES IN R
        rightPic.setImageResource(state.cat2.getImg(this));

    }

    public void onQuitPress(View v) {
        Intent qIntent = new Intent(this, MainActivity.class);
        startActivity(qIntent);
    }

    public void onNextPress(View v) {
        if (state.guessPhase == false && guesses < 10) {
        Intent rIntent = getIntent();
        rIntent.putExtra("score", score);
        rIntent.putExtra("guesses", guesses);
        rIntent.putStringArrayListExtra("wrongcats",wcs);
        rIntent.putStringArrayListExtra("rightcats",rcs);
//        rIntent.putExtra("wrongcats",String.valueOf(wrongCats));
//        rIntent.putExtra("rightcats",String.valueOf(rightCats));
        finish();
        startActivity(rIntent);
        }
        if (state.guessPhase == false && guesses >= 10){

          Intent rIntent = new Intent(this, ComparisonResults.class);

            rIntent.putStringArrayListExtra("wrongcats",wcs);
            rIntent.putStringArrayListExtra("rightcats",rcs);

            rIntent.putExtra("score",score);
            rIntent.putExtra("guesses",guesses);

            finish();
            startActivity(rIntent);
        }
    }

    public void onRightPicturePress(View v) {
        ImageView emblem = findViewById(R.id.guessResultRight);
        ImageView pic = findViewById(R.id.comparisonRightImage);
        ImageButton opic = findViewById(R.id.comparisonLeftImage);
        Button quitter = findViewById(R.id.quit_button);
        Button nexter = findViewById(R.id.next_button);
        TextView res = findViewById(R.id.comparisonDescription);
        TextView scoreCount = findViewById(R.id.scoreText);
        guesses ++;
        if (state.guess(state.cat2.getImgName())) {
            emblem.setImageResource(R.drawable.ic_star_black_48dp);
            score ++;
            rcs.add(state.cat2.getName());
            scoreCount.setTextColor(Color.GREEN);
            res.setText("Yep, that's " + state.cat2.getName() + " alright!");
        }
        else {
            emblem.setImageResource(R.drawable.ic_not_interested_black_48dp);

            wcs.add(state.cat1.getName());

            res.setText("Sorry, that's " + state.cat2.getName() + ".");
            scoreCount.setTextColor(Color.RED);
        }


        scoreCount.setText("You've guessed " + score + " out of " + guesses + " animals correctly");
        quitter.setVisibility(View.VISIBLE);
        quitter.setActivated(true);
        nexter.setVisibility(View.VISIBLE);
        nexter.setEnabled(true);
        emblem.setVisibility(View.VISIBLE);
        pic.setEnabled(false);
        opic.setEnabled(false);
    }

    public void onLeftPicturePress(View v) {
        ImageView emblem = findViewById(R.id.guessResultLeft);
        ImageView pic = findViewById(R.id.comparisonRightImage);
        ImageButton opic = findViewById(R.id.comparisonLeftImage);
        Button quitter = findViewById(R.id.quit_button);
        Button nexter = findViewById(R.id.next_button);
        TextView res = findViewById(R.id.comparisonDescription);
        TextView scoreCount = findViewById(R.id.scoreText);
        guesses ++;
        if (state.guess(state.cat1.getImgName())) {
            emblem.setImageResource(R.drawable.ic_star_black_48dp);
            score ++;
            rcs.add(state.cat1.getName());
            scoreCount.setTextColor(Color.GREEN);

            res.setText("Yep, that's " + state.cat1.getName() + " alright!");
        }
        else {
            emblem.setImageResource(R.drawable.ic_not_interested_black_48dp);
            wcs.add(state.cat2.getName());

            res.setText("Sorry, that's " + state.cat1.getName() + ".");
            scoreCount.setTextColor(Color.RED);
        }


        scoreCount.setText("You've guessed " + score + " out of " + guesses + " animals correctly");
        quitter.setVisibility(View.VISIBLE);
        quitter.setActivated(true);
        nexter.setVisibility(View.VISIBLE);
        nexter.setEnabled(true);
        emblem.setVisibility(View.VISIBLE);
        pic.setEnabled(false);
        opic.setEnabled(false);
    }

}
