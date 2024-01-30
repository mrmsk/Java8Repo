package models;

public class Student {

    private int rollNo;
    private String sname;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Student( String sname,int rollNo) {
        this.rollNo = rollNo;
        this.sname = sname;
    }
}
