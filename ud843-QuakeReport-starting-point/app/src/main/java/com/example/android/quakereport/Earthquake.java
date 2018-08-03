package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    /**
     * Constructor
     * @param mMagnitude is the magnitude of earthquake
     * @param mLocation is the city location of the earthquake
     * @param mdate is the date of the earthquake happened
     */
    public Earthquake(String magnitude, String location, Long date){

        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = date;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public Long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
