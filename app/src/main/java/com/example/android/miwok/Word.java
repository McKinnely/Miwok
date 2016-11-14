package com.example.android.miwok;

/**
 * Created by mckinnely on 11/13/16.
 */

public class Word
{

    /** Default translation */
    private String mDefaultTranslation;


    /** Miwok translation */
    private String mMiwokTranslation;


    public Word(String defaultTranslation, String miwokTranslation)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation   = miwokTranslation;
    }



    public  String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }
}
