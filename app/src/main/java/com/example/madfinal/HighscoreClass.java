package com.example.madfinal;

// Code from github https://github.com/JamieBredin/AndoridStudioDatabase
public class HighscoreClass <HighscoreClass>{
    int _id;
    String _name;
    int _highscore;

    public HighscoreClass(){   }
    public HighscoreClass(int id, String name, int highscore){
        this._id = id;
        this._name = name;
        this._highscore = highscore;
    }

    public HighscoreClass(String name, int highscore){
        this._name = name;
        this._highscore = highscore;
    }
    public int getID(){
        return this._id;
    }

    public void setID(int id){
        this._id = id;
    }

    public String getName(){
        return this._name;
    }

    public void setName(String name){
        this._name = name;
    }

    public int getHighscore(){
        return this._highscore;
    }

    public void setHighscore(int highscore){
        this._highscore = highscore;
    }
    // Added to string override for displaying scores
    @Override
    public String toString(){
        return "Name: " + getName() + " | Score: " + getHighscore();
    }
}
