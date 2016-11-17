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

    /** Miwok image view */
    private int mImageResourceId = NO_IMAGE_FOUND;

    private  static final int NO_IMAGE_FOUND = -1;


    public Word(String defaultTranslation, String miwokTranslation)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation   = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation   = miwokTranslation;
        mImageResourceId    = imageResourceId;
    }


    public  String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }



    public  int getImageResourceId()
    {
        return mImageResourceId;
    }

    public boolean hasImage()
    {
        return  mImageResourceId != NO_IMAGE_FOUND;
    }
}
