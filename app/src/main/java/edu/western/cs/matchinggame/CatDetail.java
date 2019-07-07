package edu.western.cs.matchinggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import edu.western.cs.matchinggame.Model.Animal;

public class CatDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_detail);

        Intent intent = getIntent();

        int img = (int) getIntent().getExtras().get("img");
        String name = getIntent().getExtras().get("name").toString();
        String gender = getIntent().getExtras().get("gender").toString();
        String species = getIntent().getExtras().get("species").toString();
        String story = getIntent().getExtras().get("story").toString();
        String nickname = getIntent().getExtras().get("nickname").toString();
        String funfact = getIntent().getExtras().get("funfact").toString();




        ImageView mainimg = findViewById(R.id.catimg);
        TextView nametxt = findViewById(R.id.name);
        TextView gendertxt = findViewById(R.id.gender);
        TextView speciestxt = findViewById(R.id.species);
        TextView storytxt = findViewById(R.id.story);
        TextView nicknametxt = findViewById(R.id.nickname);
        TextView funfacttxt = findViewById(R.id.funfact);

        mainimg.setImageResource(img);
        nametxt.setText(name);
        gendertxt.setText(gender);
        speciestxt.setText(species);
        nicknametxt.setText("Nickname(s): " + nickname);
        funfacttxt.setText("Fun fact: " + funfact);
        storytxt.setText(story);



        //get extra value from intent



        //display value to layout->name,email,phone,location


    }
    public void onBackPress(View view){
        finish();

    }
}
