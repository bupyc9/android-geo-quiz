package ru.bupyc9.geoquiz;

public class Question {
    private int mTextRestId;
    private boolean mAnswerTrue;

    public Question (int textRestId, boolean answerTrue) {
        mTextRestId = textRestId;
        mAnswerTrue = answerTrue;
    }

    public int getTextRestId() {
        return mTextRestId;
    }

    public void setTextRestId(int textRestId) {
        mTextRestId = textRestId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
