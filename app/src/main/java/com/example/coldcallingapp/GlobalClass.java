package com.example.coldcallingapp;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;

public class GlobalClass extends Application {
    private final Student[] mStudents = {
            new Student("Aamir", "Ali"), new Student("Adrian", "Yan"), new Student("Alex", "Aney"), new Student("Bipra", "Dey"), new Student("Daniel", "Dultsin"), new Student("Darren", "Dong"), new Student("Dennis", "Wang"), new Student("Dhruv", "Amin"), new Student("Eden", "Kogan"), new Student("Eli", "Bui"), new Student("Elie", "Belkin"), new Student("Evelyn", "Paskhaver"), new Student("Fardin", "Iqbal"), new Student("Gareth", "Chaston"), new Student("Jerry", "He"), new Student("Kenny", "Cao"), new Student("Marc", "Rosenberg"), new Student("Matthew", "Chen"), new Student("Michael", "Wu"), new Student("Ming", "Lin"), new Student("Mohammed", "Ihtisham"), new Student("Noam", "Canter"), new Student("Ralf", "Pacia"), new Student("Samuel", "Iskhakov"), new Student("Sean", "Kerrigan"), new Student("Sebastian", "Marinescu"), new Student("Selina", "Li"), new Student("Shuyue", "Chen"), new Student("Tanushri", "Sundaram"), new Student("Tejas", "Ravi"), new Student("Vasu", "Patel"), new Student("Xinrui", "Ge"), new Student("Zhian", "Maysoon")
    };
    private ArrayList<Student> mUncalled = new ArrayList<Student>(Arrays.asList(mStudents));
    private ArrayList<String> mCalled = new ArrayList<String>(); // includes name, time called, and total times called

    public Student[] getStudents() {
        return mStudents;
    }

    public ArrayList<Student> getUncalled() {
        return mUncalled;
    }

    public ArrayList<String> getCalled() {
        return mCalled;
    }



}
