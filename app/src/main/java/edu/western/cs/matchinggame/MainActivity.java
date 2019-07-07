package edu.western.cs.matchinggame;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.Button;
import android.view.View;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button compareGame = findViewById(R.id.play_comparison);

    }

    public void start_compare(View view){
        Intent intent = new Intent(this,ComparisonGame.class);
        intent.putExtra("score",0);
        intent.putExtra("guesses",0);
        intent.putStringArrayListExtra("wrongcats", new ArrayList<String>());
        intent.putStringArrayListExtra("rightcats", new ArrayList<String>());

        startActivity(intent);

    }

    public void to_site(View view){
        Uri url = Uri.parse("http://www.carerescuetexas.com");
        Intent site = new Intent(Intent.ACTION_VIEW, url);
        startActivity(site);
    }

}
