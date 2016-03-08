package com.example.bradley.geoquiz;

import java.util.ArrayList;

/**
 * Created by Bradley on 2/5/2016.
 */
public class School {
    ArrayList<Student>mStudents = new ArrayList<Student>();
    ArrayList<Teacher>mTeachers = new ArrayList<Teacher>();

    public School(ArrayList<Student> students, ArrayList<Teacher> teachers) {
        mStudents = students;
        mTeachers = teachers;
    }

    public String getGradeLevel(int level){
        String studentsAtGradeLevel = "";
        for (int i=0;i<mStudents.size();i++){
            if (mStudents.get(i).getLevel() == level){
                studentsAtGradeLevel = studentsAtGradeLevel + mStudents.get(i).toString() + "\n";
            }
        }
        return studentsAtGradeLevel;
    }

    @Override
    public String toString() {
        String returnStatement1 = "Faculty: \n";

        for (int i=0;i<mTeachers.size();i++){
            returnStatement1 = returnStatement1 + mTeachers.get(i).toString();
        }

        String returnStatement2 =  "Students: \n";
        for (int i=0;i<mStudents.size();i++){
            returnStatement2 = returnStatement2 + mStudents.get(i).toString();
        }
        return returnStatement1 + returnStatement2;
    }
}
