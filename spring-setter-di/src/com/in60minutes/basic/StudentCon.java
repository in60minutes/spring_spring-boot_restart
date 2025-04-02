package com.in60minutes.basic;

public class StudentCon {
    private String studentName;
    private long mobileNumber;
    private AddressCon addressCon;

    public StudentCon(String studentName, long mobileNumber, AddressCon addressCon) {
        this.studentName = studentName;
        this.mobileNumber = mobileNumber;
        this.addressCon = addressCon;
    }
}
