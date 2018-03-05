package com.example.android.miwok;

/**
 * Created by darshan on 4/3/18.
 */

public class Word {

    //private
    private String mDefaultTranslation,mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
