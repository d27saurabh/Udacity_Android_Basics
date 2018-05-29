package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;


    //constructor
    public Word(String defaultTranslation,String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //get miwok translation of the word
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    //Get default translation
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }
}
