package com.in60minutes.bothfiles;

public class Student {
    private int studentId;
    private String studentName;
    private String mobileNo;
    private CollageAddress collageAddress;

    public int getStudentId() {
        System.out.println("Student ...");
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public CollageAddress getCollageAddress() {
        return collageAddress;
    }

    public void setCollageAddress(CollageAddress collageAddress) {
        this.collageAddress = collageAddress;
    }
}
