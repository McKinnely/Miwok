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

    private int mAudioResourceID;

    private  static final int NO_IMAGE_FOUND = -1;




    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId)
    {

        mMiwokTranslation   = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId    = imageResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceID)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation   = miwokTranslation;
        mImageResourceId    = imageResourceId;
        mAudioResourceID    = audioResourceID;
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

    public int getAudioResourceID()
    {
        return mAudioResourceID;
    }
}
