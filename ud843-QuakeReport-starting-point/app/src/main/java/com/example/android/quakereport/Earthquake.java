package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    /**
     * Constructor
     * @param magnitude is the magnitude of earthquake
     * @param location is the city location of the earthquake
     * @param date is the date of the earthquake happened
     */
    public Earthquake(double magnitude, String location, Long date){

        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = date;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public Long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
