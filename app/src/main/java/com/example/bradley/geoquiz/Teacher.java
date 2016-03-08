package com.example.bradley.geoquiz;

/**
 * Created by Bradley on 2/5/2016.
 */
public class Teacher extends Person {
    String mSubject;

    public Teacher(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        mSubject = subject;
    }

    @Override
    public String toString() {
        return mLastName + ", " + mFirstName +
                "\n   Subject: " + mSubject;
    }

    public String getSubject() {
        return mSubject;
    }

    public void setSubject(String subject) {
        mSubject = subject;
    }
}
