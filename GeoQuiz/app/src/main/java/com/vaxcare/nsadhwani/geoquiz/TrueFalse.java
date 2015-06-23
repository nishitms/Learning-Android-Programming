package com.vaxcare.nsadhwani.geoquiz;

/**
 * Created by nsadhwani on 6/22/2015.
 */
public class TrueFalse {

    private int mQuestions;
    private boolean mTrueQuestions;

    public TrueFalse(int question, boolean trueQuestion){
        mQuestions = question;
        mTrueQuestions = trueQuestion;
    }

    public int getQuestions() {
        return mQuestions;
    }

    public void setQuestions(int questions) {
        mQuestions = questions;
    }

    public boolean isTrueQuestions() {
        return mTrueQuestions;
    }

    public void setTrueQuestions(boolean trueQuestions) {
        mTrueQuestions = trueQuestions;
    }
}
