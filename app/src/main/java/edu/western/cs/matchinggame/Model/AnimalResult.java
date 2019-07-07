package edu.western.cs.matchinggame.Model;

import android.content.Context;
import android.content.res.Resources;

public class AnimalResult {
    private String img;
    private String name;
    private String species;
    private String gender;
    private String story;
    private String nickname;
    private String funfact;
    private boolean correct;

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }


    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFunfact() {
        return funfact;
    }

    public void setFunfact(String funfact) {
        this.funfact = funfact;
    }


    public int getImg(Context context){
        Resources resources = context.getResources();
        final int resourceId = resources.getIdentifier(img, "drawable",context.getPackageName());
        return resourceId;
    }

    public void setImgName(String img) {
        this.img = img;
    }

    public String getImgName(){
        return img;
    }

    public void setName(String name){ this.name = name;    }

    public String getName() {
        return name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() { return gender;    }
}
