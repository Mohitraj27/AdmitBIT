package com.example.se_firebase;

public class model {

    String name,Seat_Accepted,Enrollment_no;

    model()
    {

    }
    public model(String name, String seat_Accepted, String enrollment_no) {
        this.name = name;
        this.Seat_Accepted = seat_Accepted;
        this.Enrollment_no = enrollment_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeat_Accepted() {
        return Seat_Accepted;
    }

    public void setSeat_Accepted(String seat_Accepted) {
       this.Seat_Accepted = seat_Accepted;
    }

    public String getEnrollment_no() {
        return Enrollment_no;
    }

    public void setEnrollment_no(String enrollment_no) {
        this.Enrollment_no = enrollment_no;
    }
}
