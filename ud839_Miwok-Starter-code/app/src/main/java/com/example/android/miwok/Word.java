package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;




    /**
     * A word constructor with english word and miwok word- specially for phrases activity
     * @param defaultTranslation is the word in a language that the user wants
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation,String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }


    /**
     * Another Word constructor for including image to the custom adaptor- for colors, numbers and family activity
     * @param defaultTranslation is the word in a language that the user wants
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image assets
     */
    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    //get miwok translation of the word
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    //Get default translation
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    //Get image resource ID
    public int getImageResourceID(){return  mImageResourceId; }
}
