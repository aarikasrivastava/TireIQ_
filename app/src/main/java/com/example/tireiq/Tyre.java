package com.example.tireiq;

public class Tyre {
    private String mTyreNumber;
    private int mImageResourceId;

    public Tyre(int vImage, String vTyre) {
        mTyreNumber = vTyre;
        mImageResourceId = vImage;
    }
public String getTyreNumber() {return mTyreNumber;}
public int getImageResourceId(){return mImageResourceId;}



}