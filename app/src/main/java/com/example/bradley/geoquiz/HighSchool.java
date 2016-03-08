package com.example.bradley.geoquiz;

/**
 * Created by Bradley on 2/5/2016.
 */
public class HighSchool extends Student {
    double mGPA;

    public HighSchool(String firstName, String lastName, int gradeLevel, double GPA) {
        super(firstName, lastName, gradeLevel);
        if (GPA<=5&&GPA>=0)
            mGPA = GPA;
        else
            mGPA = 0;
    }

    @Override
    public String toString() {
        return mLastName + ", " + mFirstName +
                "\n   Grade Level: " + mLevel +
                "\n   ID #: " + mStudentId +
                "\n   GPA: " + mGPA;
    }
}
