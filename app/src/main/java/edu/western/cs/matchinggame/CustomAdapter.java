package edu.western.cs.matchinggame;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import edu.western.cs.matchinggame.Model.Animal;
import edu.western.cs.matchinggame.Model.AnimalResult;

/**
 * Created by honginpark on 1/30/18.
 */

public class CustomAdapter extends ArrayAdapter {

    private Context mContext;
    private int mListItemLayout;
    private ArrayList<AnimalResult> mList;


    //being called when creation
    //constructor
    //take 3 inputs and make them available for getView()
    public CustomAdapter(Context context, int resource, ArrayList<AnimalResult> animalList) {
        super(context,resource,animalList);

        mContext= context;
        mListItemLayout=resource;
        mList=animalList;

    }


    //when row of list created, getview() called each time
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        View view;


        //data process, position of row-> 0,1,2,3,4,...
        //using position, get a animal from list
        final AnimalResult animal = mList.get(position);


//        convertview is reusable view for the row.
        //once you inflate the row, convertview is available for reuse.
        if(convertView==null){
            Log.d("ddd",position+" convertview is null");

            LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            view = layoutInflater.inflate(mListItemLayout, null, false);

        }else{
            view = convertView;
            Log.d("ddd",position+" convertview is not null....");
        }



        ImageView catimg = view.findViewById(R.id.catimage);
        TextView name = view.findViewById(R.id.catname);
//        TextView gender = view.findViewById(R.id.gender);
        TextView species = view.findViewById(R.id.species);

        catimg.setImageResource(animal.getImg(getContext()));
        name.setText(animal.getName());
//        gender.setText(animal.getGender());
        species.setText(animal.getSpecies());

        if (animal.isCorrect()){
            view.setBackgroundColor(mContext.getResources().getColor(R.color.LimeGreen));
        }
        else{
            view.setBackgroundColor(mContext.getResources().getColor(R.color.Red));
        }

        //identify a animal and make change
        //make sure add else....

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("ddd", animal.getName()+" clicked...");


                Intent intent = new Intent(mContext, CatDetail.class);
//                intent.putExtra("animal",String.valueOf(animal));
                intent.putExtra("img",animal.getImg(getContext()));
                intent.putExtra("name",animal.getName());
                intent.putExtra("gender",animal.getGender());
                intent.putExtra("species",animal.getSpecies());
                intent.putExtra("nickname", animal.getNickname());
                intent.putExtra("funfact", animal.getFunfact());
                intent.putExtra("story", animal.getStory());
                mContext.startActivity(intent);
            }
        });
        return  view;

    }






}