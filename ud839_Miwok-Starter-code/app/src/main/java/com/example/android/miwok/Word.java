package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * A word constructor with english word and miwok word- specially for phrases activity
     * @param defaultTranslation is the word in a language that the user wants
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation,String miwokTranslation,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }


    /**
     * Another Word constructor for including image to the custom adaptor- for colors, numbers and family activity
     * @param defaultTranslation is the word in a language that the user wants
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image assets
     * @param imageResourceId is the drawable resource ID for the audio assets
     */
    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    /**
     *
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


    /**
     *
     * @return Returns the audio assiocated with the word object
     */
    public int getAudioResourceID(){return  mAudioResourceId; }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
