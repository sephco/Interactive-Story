package com.sephcordovano.interactivestory.model;

public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage){
        setText(text);
        setNextPage(nextPage);
    }

    //********** Getter Setter Methods **********
    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
