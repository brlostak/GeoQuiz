package com.example.bradley.geoquiz;

/**
 * Created by Bradley on 2/5/2016.
 */
public class Person {
    String mFirstName;
    String mLastName;

    public Person(String firstName, String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    @Override
    public String toString() {
        return mLastName + ", " + mFirstName;
    }
}
