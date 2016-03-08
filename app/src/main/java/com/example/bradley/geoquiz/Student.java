package com.example.bradley.geoquiz;

/**
 * Created by Bradley on 2/5/2016.
 */
public class Student extends Person {
    static int mStudentIdS;
    int mStudentId;
    int mLevel;

    public Student(String firstName, String lastName, int gradeLevel){
        super(firstName, lastName);
        if (gradeLevel<=12 && gradeLevel>=0)
            mLevel = gradeLevel;
        else
            mLevel = 0;
        mStudentIdS++;
        mStudentId = mStudentIdS;
    }

    public int getLevel() {
        return mLevel;
    }

        public void setLevel(int level) {
        mLevel = level;
    }


}
