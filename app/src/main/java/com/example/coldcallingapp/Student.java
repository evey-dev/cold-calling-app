package com.example.coldcallingapp;

public class Student {

    private String mFirstName;
    private String mLastName;
    private int mTimesCalled = 0; // resets after 2 times called in 40 minutes
    private int mTotalCalled = 0; // never resets
    private long mLastCalled;

    public Student(String firstName, String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
    }

    public String getFileName() {
        return (mFirstName + "_" + mLastName).toLowerCase();
    }

    public String toString() {
        return mFirstName + " " + mLastName;
    }

    public int getTimesCalled() {
        return mTimesCalled;
    }

    public void setTimesCalled(int timesCalled) {
        mTimesCalled = timesCalled;
    }

    public long getLastCalled() {
        return mLastCalled;
    }

    public void setLastCalled(long lastCalled) {
        mLastCalled = lastCalled;
    }

    public int getTotalCalled() {
        return mTotalCalled;
    }

    public void setTotalCalled(int totalCalled) {
        mTotalCalled = totalCalled;
    }
}
