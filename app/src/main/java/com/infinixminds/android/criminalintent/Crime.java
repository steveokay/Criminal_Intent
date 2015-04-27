package com.infinixminds.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Leptonian on 4/16/2015.
 * Welcome to Lepton The open source Galaxy.
 * ~~~~~~The future is open source ~~~~~
 * ~~~Open source starts with you ~~ The future starts with you~~
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        mId=UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
