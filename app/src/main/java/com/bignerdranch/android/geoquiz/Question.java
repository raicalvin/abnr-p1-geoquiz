package com.bignerdranch.android.geoquiz;

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mQuestionAnswered;

    public Question(int textResId, boolean answerTrue, boolean questionAnswered) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mQuestionAnswered = questionAnswered;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public void setQuestionAnswered(boolean answered) {
        mQuestionAnswered = answered;
    }

    public boolean questionIsAnswered() {
        return mQuestionAnswered;
    }
}
